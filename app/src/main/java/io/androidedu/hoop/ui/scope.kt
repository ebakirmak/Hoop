package io.androidedu.hoop.ui

fun main() {

    val pasta = Pasta().apply {
        this.Type = "Spagetti"
        this.Amount = 2
        this.Sause = false
        this.PreparePasta()
    }.also {
        print("Makarna objesi oluşturuldu. {${it.Type}}")
    }
}

class Pasta {
    var Type: String? = null
    var Amount: Int? = null
    var Sause: Boolean? = null

    fun PreparePasta() {
        print("Makarna hazırlandı...")
    }


}

class Pot(val WaterAmount: Int) {

    fun TakePasta(pasta: Pasta) {
        print("Makarna Tencereye konuldu...")
    }
}

class Stove(val Heat: Int) {

    fun TakePot(pot: Pot) {
        print("Tencere Ocağa konuldu...")
    }
}