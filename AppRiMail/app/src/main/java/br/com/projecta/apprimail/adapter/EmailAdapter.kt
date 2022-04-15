package br.com.projecta.apprimail.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.projecta.apprimail.R
import br.com.projecta.apprimail.model.Email

class EmailAdapter( private val emails : MutableList<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    override fun onCreateViewHolder( parent : ViewGroup, p1: Int): EmailViewHolder {

        val view  = LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent, false)

        return  EmailViewHolder(view)

    }

    override fun onBindViewHolder(holder: EmailViewHolder, posicao: Int) {

        holder?.let {


        //    it.txt_user.text = emails[posicao].user
        }

        holder.bind(emails[posicao])
    }

    override fun getItemCount(): Int = emails.size

    class EmailViewHolder constructor( itemView : View ) : RecyclerView.ViewHolder(itemView) {
//
//        init {
//            itemView.findViewById<TextView>(R.id.txt_user)
//        }

        fun bind(email: Email) {
            itemView.findViewById<TextView>(R.id.txt_icon).text     = email.user.subSequence(1, 1)
            itemView.findViewById<TextView>(R.id.txt_user).text     = email.user
            itemView.findViewById<TextView>(R.id.txt_date).text     = email.data
            itemView.findViewById<TextView>(R.id.text_preview).text = email.preview
            itemView.findViewById<TextView>(R.id.subject).text      = email.subject

        }

    }

}