package br.com.projecta.apprimail.model

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
        stared = true
    },
    email {
        user = "Itau"
        subject = "Voce ganhou na mega Sena"
        preview = "Venha pegar seu premio"
        data = "19 ago"
        stared = false
    },
    email {
        user = "Ukrania X Russia"
        subject = "Fim da guerra entrer ukrania e russian a paz será restabelicida"
        preview = "Ótima Notícia"
        data = "16 jun"
        stared = true
        unread = true
    },
    email {
        user = "Instagran"
        subject = "Curtiram sua foto agora"
        preview = "Vem conferiar"
        data = "02 jan"
        stared = true
        unread = true
    },    email {
        user = "Facebook"
        subject = "O trem que passa por aqui é fodha de mais da conta"
        preview = "Urgente olhe isso"
        data = "16 jun"
        stared = false
    },
    email {
        user = "Itau"
        subject = "Voce ganhou na mega Sena"
        preview = "Venha pegar seu premio"
        data = "19 ago"
        stared = false
        unread = true
    },
    email {
        user = "Ukrania X Russia"
        subject = "Fim da guerra entrer ukrania e russian a paz será restabelicida"
        preview = "Ótima Notícia"
        data = "16 jun"
        stared = true
    },
    email {
        user = "Instagran"
        subject = "Curtiram sua foto agora"
        preview = "Vem conferiar"
        data = "02 jan"
        stared = false
        unread = true
    },
    email {
        user = "Itau"
        subject = "Voce ganhou na mega Sena"
        preview = "Venha pegar seu premio"
        data = "19 ago"
        stared = false
        unread = true
    },
    email {
        user = "Ukrania X Russia"
        subject = "Fim da guerra entrer ukrania e russian a paz será restabelicida"
        preview = "Ótima Notícia"
        data = "16 jun"
        stared = false
    },
    email {
        user = "Instagran"
        subject = "Curtiram sua foto agora"
        preview = "Vem conferiar"
        data = "02 jan"
        stared = true
        unread = true
    }

)