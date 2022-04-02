package br.com.projecta.rmail.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.projecta.rmail.R
import br.com.projecta.rmail.model.Email

class EmailAdapter(val emails : MutableList<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    inner class EmailViewHolder( itemView : View ) : RecyclerView.ViewHolder(itemView) {
        fun bind(email: Email) {


           // itemView.findViewById<>()
        }

    }

    override fun onCreateViewHolder( parent : ViewGroup, p1: Int): EmailViewHolder {
        val view  =
            LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent, false)

        return  EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, posicao: Int) {
        holder.bind(emails[posicao])
    }

    override fun getItemCount(): Int = emails.size

}