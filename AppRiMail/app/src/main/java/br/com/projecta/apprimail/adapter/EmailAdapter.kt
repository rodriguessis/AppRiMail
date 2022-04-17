package br.com.projecta.apprimail.adapter

import android.graphics.Color
import android.graphics.Typeface
import android.graphics.Typeface.BOLD
import android.graphics.Typeface.NORMAL
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.projecta.apprimail.R
import br.com.projecta.apprimail.model.Email

class EmailAdapter( private val emails : MutableList<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    override fun onCreateViewHolder( parent : ViewGroup, p1: Int): EmailViewHolder {

        val view  = LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent, false)

        return  EmailViewHolder(view)

    }

    public fun novoEmail( novo : Email ) {
        emails.add(0, novo)
    }

    public fun remover( posicao : Int ) {
        emails.removeAt( posicao )
    }

    override fun onBindViewHolder(holder: EmailViewHolder, posicao: Int) {

        holder?.let {


        //    it.txt_user.text = emails[posicao].user
        }

        holder.bind(emails[posicao])
    }

    override fun getItemCount(): Int = emails.size

    class EmailViewHolder constructor( itemView : View ) : RecyclerView.ViewHolder(itemView) {

        private val txtIcon     = itemView.findViewById<TextView>(R.id.txt_icon)
        private val txtUser     = itemView.findViewById<TextView>(R.id.txt_user)
        private val txtDate     = itemView.findViewById<TextView>(R.id.txt_date)
        private val txtPreview  = itemView.findViewById<TextView>(R.id.text_preview)
        private val txtSubject  = itemView.findViewById<TextView>(R.id.subject)
        private val txtImg      = itemView.findViewById<ImageView>(R.id.img_star)

        fun bind(email: Email) {

            with ( email ) {
                val hash = user.hashCode()
                txtIcon.text    = user.first().toString()
                txtIcon.setTextColor(Color.rgb(hash, hash / 2, 0))
                txtUser.text    = user
                txtDate.text    = data
                txtPreview.text = preview
                txtSubject.text = subject

                txtUser.setTypeface(Typeface.DEFAULT, if (unread) BOLD else NORMAL )
                txtSubject.setTypeface(Typeface.DEFAULT, if (unread) BOLD else NORMAL )
                txtDate.setTypeface(Typeface.DEFAULT, if (unread) BOLD else NORMAL )
                txtImg.setImageResource(
                    if (stared)
                        R.drawable.ic_baseline_star_border_24
                    else
                        R.drawable.ic_baseline_star_24)


            }
        }

    }

}