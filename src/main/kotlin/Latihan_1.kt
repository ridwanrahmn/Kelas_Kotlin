package Latihan_1

fun main(){
    var lamaParkir: Int
    var biayaParkir: Float

    //rule biaya parkir

    val tarifDasar = 1.0
    val tarifBerikutnya = 0.5
    val maxTarifperHari = 15

    lamaParkir=26

    if(lamaParkir <=5){
        biayaParkir=(lamaParkir*tarifDasar).toFloat()
    }
    else if((lamaParkir>5)&&(lamaParkir<24)){
        biayaParkir=(5+((lamaParkir-5)*tarifBerikutnya)).toFloat()
    }
    else{
        biayaParkir=(15+((lamaParkir-24)*tarifBerikutnya)).toFloat()
    }

    println("Lama Parkir: $lamaParkir")
    println("Biaya Parkir: $biayaParkir")
}