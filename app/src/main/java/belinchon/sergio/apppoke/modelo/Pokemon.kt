// Pokemon.kt
package belinchon.sergio.apppoke.modelo

import java.io.Serializable

data class Pokemon(
    val numero : Int,
    val nombre: String,
    val tipo: String,
    val estadisticasBase: Map<String, Int>
) : Serializable
