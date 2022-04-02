package br.com.projecta.rmail.model

data class Email(
    val user : String,
    val subject : String,
    val preview : String,
    val data : String,
    val stared : Boolean,
    val unread : Boolean,
    var selected : Boolean = false

)

class EmailBuilder {
    var user : String = ""
    var subject : String = ""
    var preview : String = ""
    var data : String = ""
    var stared : Boolean = false
    var unread : Boolean = false

    fun build() : Email = Email(user, subject, preview, data, stared, unread, false)

}

fun email( block : EmailBuilder.() -> Unit  ) : Email = EmailBuilder().apply(block).build()

fun fakeEmails() : MutableList<Email> = mutableListOf<Email>(

    email {
        user = "Facebook"
        subject = "O trem que passa por aqui é fodha de mais da conta"
        preview = "Urgente olhe isso"
        data = "16 jun"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "O trem que passa por aqui é fodha de mais da conta"
        preview = "Urgente olhe isso"
        data = "16 jun"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "O trem que passa por aqui é fodha de mais da conta"
        preview = "Urgente olhe isso"
        data = "16 jun"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "O trem que passa por aqui é fodha de mais da conta"
        preview = "Urgente olhe isso"
        data = "16 jun"
        stared = false
    },

)