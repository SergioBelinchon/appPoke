package belinchon.sergio.apppoke.repositorio

import belinchon.sergio.apppoke.modelo.Pokemon

class PokemonRepositorio
{
    private val tiposRepositorio = TiposRepositorio()

    val pokedex = listOf(
        Pokemon(1,"Bulbasur", tiposRepositorio.PLANTA_VENENO, mapOf("Ps" to 45, "Ataque" to 49, "Defensa" to 49,"At. Esp" to 65, "Def. Esp" to 65, "Velocidad" to 45)),
        Pokemon(2,"Ivysaur", tiposRepositorio.PLANTA_VENENO, mapOf("Ps" to 60, "Ataque" to 62, "Defensa" to 63,"At. Esp" to 80, "Def. Esp" to 80, "Velocidad" to 60)),
        Pokemon(3,"Venusaur", tiposRepositorio.PLANTA_VENENO, mapOf("Ps" to 80, "Ataque" to 82, "Defensa" to 83,"At. Esp" to 100, "Def. Esp" to 100, "Velocidad" to 80)),

        Pokemon(4,"Charmander", tiposRepositorio.FUEGO, mapOf("Ps" to 39, "Ataque" to 52, "Defensa" to 43,"At. Esp" to 60, "Def. Esp" to 50, "Velocidad" to 65)),
        Pokemon(5,"Charmeleon", tiposRepositorio.FUEGO, mapOf("Ps" to 58, "Ataque" to 64, "Defensa" to 58,"At. Esp" to 80, "Def. Esp" to 65, "Velocidad" to 80)),
        Pokemon(6,"Charizard", tiposRepositorio.FUEGO_VOLADOR, mapOf("Ps" to 78, "Ataque" to 84, "Defensa" to 78,"At. Esp" to 109, "Def. Esp" to 85, "Velocidad" to 100)),

        Pokemon(7,"Squirtle", tiposRepositorio.AGUA, mapOf("Ps" to 44, "Ataque" to 48, "Defensa" to 65,"At. Esp" to 50, "Def. Esp" to 64, "Velocidad" to 43)),
        Pokemon(8,"Wartortle", tiposRepositorio.AGUA, mapOf("Ps" to 59, "Ataque" to 63, "Defensa" to 80,"At. Esp" to 65, "Def. Esp" to 80, "Velocidad" to 58)),
        Pokemon(9,"Blastoise", tiposRepositorio.AGUA, mapOf("Ps" to 79, "Ataque" to 83, "Defensa" to 100,"At. Esp" to 85, "Def. Esp" to 105, "Velocidad" to 78)),

        Pokemon(10,"Caterpie", tiposRepositorio.BICHO, mapOf("Ps" to 45, "Ataque" to 30, "Defensa" to 35,"At. Esp" to 20, "Def. Esp" to 20, "Velocidad" to 45)),
        Pokemon(11,"Metapod", tiposRepositorio.BICHO, mapOf("Ps" to 60, "Ataque" to 62, "Defensa" to 55,"At. Esp" to 25, "Def. Esp" to 25, "Velocidad" to 30)),
        Pokemon(12,"Butterfree", tiposRepositorio.BICHO_VOLADOR, mapOf("Ps" to 60, "Ataque" to 45, "Defensa" to 50,"At. Esp" to 90, "Def. Esp" to 80, "Velocidad" to 70)),

        Pokemon(13,"Weedle", tiposRepositorio.BICHO_VENENO, mapOf("Ps" to 40, "Ataque" to 35, "Defensa" to 30,"At. Esp" to 20, "Def. Esp" to 20, "Velocidad" to 50)),
        Pokemon(14,"Kakuna", tiposRepositorio.BICHO_VENENO, mapOf("Ps" to 45, "Ataque" to 25, "Defensa" to 50,"At. Esp" to 25, "Def. Esp" to 25, "Velocidad" to 35)),
        Pokemon(15,"Beedrill", tiposRepositorio.BICHO_VENENO, mapOf("Ps" to 65, "Ataque" to 80, "Defensa" to 40,"At. Esp" to 45, "Def. Esp" to 80, "Velocidad" to 75)),

        Pokemon(152,"Chikorita", tiposRepositorio.PLANTA, mapOf("Ps" to 45, "Ataque" to 49, "Defensa" to 65,"At. Esp" to 49, "Def. Esp" to 65, "Velocidad" to 45)),
        Pokemon(153,"Bayleef", tiposRepositorio.PLANTA, mapOf("Ps" to 60, "Ataque" to 62, "Defensa" to 80,"At. Esp" to 63, "Def. Esp" to 80, "Velocidad" to 60)),
        Pokemon(154,"Meganium", tiposRepositorio.PLANTA, mapOf("Ps" to 80, "Ataque" to 82, "Defensa" to 100,"At. Esp" to 83, "Def. Esp" to 100, "Velocidad" to 80)),

        Pokemon(155,"Cyndaquil", tiposRepositorio.FUEGO, mapOf("Ps" to 39, "Ataque" to 52, "Defensa" to 43,"At. Esp" to 60, "Def. Esp" to 50, "Velocidad" to 65)),
        Pokemon(156,"Quilava", tiposRepositorio.FUEGO, mapOf("Ps" to 58, "Ataque" to 64, "Defensa" to 58,"At. Esp" to 80, "Def. Esp" to 65, "Velocidad" to 80)),
        Pokemon(157,"Typhlosion", tiposRepositorio.FUEGO, mapOf("Ps" to 78, "Ataque" to 84, "Defensa" to 78,"At. Esp" to 109, "Def. Esp" to 85, "Velocidad" to 100)),

        Pokemon(157,"TyphlosionHisui", tiposRepositorio.FUEGO_FANTASMA, mapOf("Ps" to 73, "Ataque" to 84, "Defensa" to 78,"At. Esp" to 119, "Def. Esp" to 85, "Velocidad" to 95)),

        Pokemon(158,"Totodile", tiposRepositorio.AGUA, mapOf("Ps" to 50, "Ataque" to 65, "Defensa" to 64,"At. Esp" to 44, "Def. Esp" to 48, "Velocidad" to 43)),
        Pokemon(159,"Croconaw", tiposRepositorio.AGUA, mapOf("Ps" to 65, "Ataque" to 80, "Defensa" to 80,"At. Esp" to 59, "Def. Esp" to 63, "Velocidad" to 58)),
        Pokemon(160,"Feraligatr", tiposRepositorio.AGUA, mapOf("Ps" to 85, "Ataque" to 105, "Defensa" to 100,"At. Esp" to 79, "Def. Esp" to 83, "Velocidad" to 78)),

        Pokemon(252,"Treecko", tiposRepositorio.PLANTA, mapOf("Ps" to 40, "Ataque" to 45, "Defensa" to 35,"At. Esp" to 65, "Def. Esp" to 55, "Velocidad" to 70)),
        Pokemon(253,"Grovyle", tiposRepositorio.PLANTA, mapOf("Ps" to 70, "Ataque" to 85, "Defensa" to 65,"At. Esp" to 105, "Def. Esp" to 85, "Velocidad" to 95)),
        Pokemon(254,"Sceptile", tiposRepositorio.PLANTA, mapOf("Ps" to 80, "Ataque" to 82, "Defensa" to 100,"At. Esp" to 83, "Def. Esp" to 100, "Velocidad" to 120)),

        Pokemon(255,"Torchic", tiposRepositorio.FUEGO, mapOf("Ps" to 45, "Ataque" to 60, "Defensa" to 40,"At. Esp" to 70, "Def. Esp" to 50, "Velocidad" to 45)),
        Pokemon(256,"Combusken", tiposRepositorio.FUEGO_LUCHA, mapOf("Ps" to 60, "Ataque" to 85, "Defensa" to 60,"At. Esp" to 85, "Def. Esp" to 60, "Velocidad" to 55)),
        Pokemon(257,"Blaziken", tiposRepositorio.FUEGO_LUCHA, mapOf("Ps" to 80, "Ataque" to 120, "Defensa" to 70,"At. Esp" to 110, "Def. Esp" to 70, "Velocidad" to 80)),

        Pokemon(258,"Mudkip", tiposRepositorio.AGUA, mapOf("Ps" to 50, "Ataque" to 70, "Defensa" to 50,"At. Esp" to 50, "Def. Esp" to 50, "Velocidad" to 40)),
        Pokemon(259,"Marshtomp", tiposRepositorio.AGUA_TIERRA, mapOf("Ps" to 70, "Ataque" to 85, "Defensa" to 70,"At. Esp" to 60, "Def. Esp" to 70, "Velocidad" to 50)),
        Pokemon(260,"Swampert", tiposRepositorio.AGUA_TIERRA, mapOf("Ps" to 100, "Ataque" to 110, "Defensa" to 90,"At. Esp" to 85, "Def. Esp" to 90, "Velocidad" to 60)),

        Pokemon(387,"Turtwig", tiposRepositorio.PLANTA, mapOf("Ps" to 55, "Ataque" to 68, "Defensa" to 64,"At. Esp" to 45, "Def. Esp" to 55, "Velocidad" to 31)),
        Pokemon(388,"Grotle", tiposRepositorio.PLANTA, mapOf("Ps" to 75, "Ataque" to 89, "Defensa" to 85,"At. Esp" to 55, "Def. Esp" to 65, "Velocidad" to 36)),
        Pokemon(399,"Torterra", tiposRepositorio.PLANTA_TIERRA, mapOf("Ps" to 95, "Ataque" to 109, "Defensa" to 105,"At. Esp" to 75, "Def. Esp" to 85, "Velocidad" to 56)),

        Pokemon(400,"Chimchar", tiposRepositorio.FUEGO, mapOf("Ps" to 44, "Ataque" to 58, "Defensa" to 44,"At. Esp" to 58, "Def. Esp" to 44, "Velocidad" to 61)),
        Pokemon(401,"Monferno", tiposRepositorio.FUEGO_LUCHA, mapOf("Ps" to 64, "Ataque" to 78, "Defensa" to 52,"At. Esp" to 78, "Def. Esp" to 52, "Velocidad" to 81)),
        Pokemon(402,"Infernape", tiposRepositorio.FUEGO_LUCHA, mapOf("Ps" to 76, "Ataque" to 104, "Defensa" to 71,"At. Esp" to 104, "Def. Esp" to 71, "Velocidad" to 108)),

        Pokemon(403,"Piplup", tiposRepositorio.AGUA, mapOf("Ps" to 53, "Ataque" to 51, "Defensa" to 53,"At. Esp" to 61, "Def. Esp" to 56, "Velocidad" to 40)),
        Pokemon(404,"Prinplup", tiposRepositorio.AGUA, mapOf("Ps" to 64, "Ataque" to 66, "Defensa" to 68,"At. Esp" to 81, "Def. Esp" to 76, "Velocidad" to 50)),
        Pokemon(405,"Empoleon", tiposRepositorio.AGUA_ACERO, mapOf("Ps" to 84, "Ataque" to 86, "Defensa" to 88,"At. Esp" to 111, "Def. Esp" to 101, "Velocidad" to 60)),

        Pokemon(494,"Victini", tiposRepositorio.PSIQUICO_FUEGO, mapOf("Ps" to 100, "Ataque" to 100, "Defensa" to 100,"At. Esp" to 100, "Def. Esp" to 100, "Velocidad" to 100)),

        Pokemon(495,"Snivy", tiposRepositorio.PLANTA, mapOf("Ps" to 45, "Ataque" to 45, "Defensa" to 55,"At. Esp" to 45, "Def. Esp" to 55, "Velocidad" to 63)),
        Pokemon(496,"Servine", tiposRepositorio.PLANTA, mapOf("Ps" to 60, "Ataque" to 60, "Defensa" to 75,"At. Esp" to 60, "Def. Esp" to 75, "Velocidad" to 83)),
        Pokemon(497,"Serperior", tiposRepositorio.PLANTA, mapOf("Ps" to 75, "Ataque" to 75, "Defensa" to 95,"At. Esp" to 75, "Def. Esp" to 95, "Velocidad" to 113)),

        Pokemon(498,"Tepig", tiposRepositorio.FUEGO, mapOf("Ps" to 65, "Ataque" to 63, "Defensa" to 45,"At. Esp" to 45, "Def. Esp" to 45, "Velocidad" to 45)),
        Pokemon(499,"Pignite", tiposRepositorio.FUEGO_LUCHA, mapOf("Ps" to 90, "Ataque" to 93, "Defensa" to 55,"At. Esp" to 70, "Def. Esp" to 55, "Velocidad" to 55)),
        Pokemon(500,"Emboar", tiposRepositorio.FUEGO_LUCHA, mapOf("Ps" to 110, "Ataque" to 123, "Defensa" to 65,"At. Esp" to 100, "Def. Esp" to 65, "Velocidad" to 65)),

        Pokemon(501,"Oshawott", tiposRepositorio.AGUA, mapOf("Ps" to 55, "Ataque" to 55, "Defensa" to 45,"At. Esp" to 63, "Def. Esp" to 45, "Velocidad" to 45)),
        Pokemon(502,"Dewott", tiposRepositorio.AGUA, mapOf("Ps" to 75, "Ataque" to 75, "Defensa" to 60,"At. Esp" to 83, "Def. Esp" to 60, "Velocidad" to 60)),
        Pokemon(503,"Samurott", tiposRepositorio.AGUA, mapOf("Ps" to 95, "Ataque" to 100, "Defensa" to 85,"At. Esp" to 108, "Def. Esp" to 70, "Velocidad" to 70)),
        Pokemon(503,"SamurottHisui", tiposRepositorio.AGUA_SINIESTRO, mapOf("Ps" to 90, "Ataque" to 108, "Defensa" to 80,"At. Esp" to 100, "Def. Esp" to 65, "Velocidad" to 85)),

        Pokemon(650,"Chespin", tiposRepositorio.PLANTA, mapOf("Ps" to 56, "Ataque" to 61, "Defensa" to 65,"At. Esp" to 48, "Def. Esp" to 45, "Velocidad" to 38)),
        Pokemon(651,"Quilladin", tiposRepositorio.PLANTA, mapOf("Ps" to 61, "Ataque" to 78, "Defensa" to 95,"At. Esp" to 56, "Def. Esp" to 58, "Velocidad" to 57)),
        Pokemon(652,"Chesnaught", tiposRepositorio.PLANTA_LUCHA, mapOf("Ps" to 88, "Ataque" to 107, "Defensa" to 122,"At. Esp" to 74, "Def. Esp" to 75, "Velocidad" to 64)),

        Pokemon(653,"Fennekin", tiposRepositorio.FUEGO, mapOf("Ps" to 40, "Ataque" to 45, "Defensa" to 40,"At. Esp" to 62, "Def. Esp" to 60, "Velocidad" to 60)),
        Pokemon(654,"Braixen", tiposRepositorio.FUEGO, mapOf("Ps" to 59, "Ataque" to 59, "Defensa" to 58,"At. Esp" to 90, "Def. Esp" to 70, "Velocidad" to 73)),
        Pokemon(655,"Delphox", tiposRepositorio.FUEGO_PSIQUICO, mapOf("Ps" to 75, "Ataque" to 69, "Defensa" to 72,"At. Esp" to 114, "Def. Esp" to 100, "Velocidad" to 104)),

        Pokemon(656,"Froakie", tiposRepositorio.AGUA, mapOf("Ps" to 41, "Ataque" to 56, "Defensa" to 40,"At. Esp" to 62, "Def. Esp" to 44, "Velocidad" to 71)),
        Pokemon(657,"Frogadier", tiposRepositorio.AGUA, mapOf("Ps" to 54, "Ataque" to 63, "Defensa" to 52,"At. Esp" to 83, "Def. Esp" to 56, "Velocidad" to 97)),
        Pokemon(658,"Greninja", tiposRepositorio.AGUA_SINIESTRO, mapOf("Ps" to 72, "Ataque" to 95, "Defensa" to 67,"At. Esp" to 103, "Def. Esp" to 71, "Velocidad" to 122)),

        Pokemon(722,"Rowlet", tiposRepositorio.PLANTA_VOLADOR, mapOf("Ps" to 56, "Ataque" to 61, "Defensa" to 65,"At. Esp" to 48, "Def. Esp" to 45, "Velocidad" to 38)),
        Pokemon(723,"Dartrix", tiposRepositorio.PLANTA_VOLADOR, mapOf("Ps" to 61, "Ataque" to 78, "Defensa" to 95,"At. Esp" to 56, "Def. Esp" to 58, "Velocidad" to 57)),
        Pokemon(724,"Decidueye", tiposRepositorio.PLANTA_FANTASMA, mapOf("Ps" to 88, "Ataque" to 107, "Defensa" to 122,"At. Esp" to 74, "Def. Esp" to 75, "Velocidad" to 64)),

        Pokemon(724,"DecidueyeHisui", tiposRepositorio.PLANTA_LUCHA, mapOf("Ps" to 88, "Ataque" to 107, "Defensa" to 122,"At. Esp" to 74, "Def. Esp" to 75, "Velocidad" to 64)),

        Pokemon(725,"Litten", tiposRepositorio.FUEGO, mapOf("Ps" to 40, "Ataque" to 45, "Defensa" to 40,"At. Esp" to 62, "Def. Esp" to 60, "Velocidad" to 60)),
        Pokemon(726,"Torracat", tiposRepositorio.FUEGO, mapOf("Ps" to 59, "Ataque" to 59, "Defensa" to 58,"At. Esp" to 90, "Def. Esp" to 70, "Velocidad" to 73)),
        Pokemon(727,"Incineroar", tiposRepositorio.FUEGO_SINIESTRO, mapOf("Ps" to 75, "Ataque" to 69, "Defensa" to 72,"At. Esp" to 114, "Def. Esp" to 100, "Velocidad" to 104)),

        Pokemon(728,"Popplio", tiposRepositorio.AGUA, mapOf("Ps" to 41, "Ataque" to 56, "Defensa" to 40,"At. Esp" to 62, "Def. Esp" to 44, "Velocidad" to 71)),
        Pokemon(729,"Brionne", tiposRepositorio.AGUA, mapOf("Ps" to 54, "Ataque" to 63, "Defensa" to 52,"At. Esp" to 83, "Def. Esp" to 56, "Velocidad" to 97)),
        Pokemon(730,"Primarina", tiposRepositorio.AGUA_HADA, mapOf("Ps" to 72, "Ataque" to 95, "Defensa" to 67,"At. Esp" to 103, "Def. Esp" to 71, "Velocidad" to 122)),

        Pokemon(810,"Grookey", tiposRepositorio.PLANTA, mapOf("Ps" to 56, "Ataque" to 61, "Defensa" to 65,"At. Esp" to 48, "Def. Esp" to 45, "Velocidad" to 38)),
        Pokemon(811,"Thwackey", tiposRepositorio.PLANTA, mapOf("Ps" to 61, "Ataque" to 78, "Defensa" to 95,"At. Esp" to 56, "Def. Esp" to 58, "Velocidad" to 57)),
        Pokemon(812,"Rillaboom", tiposRepositorio.PLANTA, mapOf("Ps" to 88, "Ataque" to 107, "Defensa" to 122,"At. Esp" to 74, "Def. Esp" to 75, "Velocidad" to 64)),

        Pokemon(813,"Scorbunny", tiposRepositorio.FUEGO, mapOf("Ps" to 40, "Ataque" to 45, "Defensa" to 40,"At. Esp" to 62, "Def. Esp" to 60, "Velocidad" to 60)),
        Pokemon(814,"Raboot", tiposRepositorio.FUEGO, mapOf("Ps" to 59, "Ataque" to 59, "Defensa" to 58,"At. Esp" to 90, "Def. Esp" to 70, "Velocidad" to 73)),
        Pokemon(815,"Cinderace", tiposRepositorio.FUEGO, mapOf("Ps" to 75, "Ataque" to 69, "Defensa" to 72,"At. Esp" to 114, "Def. Esp" to 100, "Velocidad" to 104)),

        Pokemon(816,"Sobble", tiposRepositorio.AGUA, mapOf("Ps" to 41, "Ataque" to 56, "Defensa" to 40,"At. Esp" to 62, "Def. Esp" to 44, "Velocidad" to 71)),
        Pokemon(817,"Drizzile", tiposRepositorio.AGUA, mapOf("Ps" to 54, "Ataque" to 63, "Defensa" to 52,"At. Esp" to 83, "Def. Esp" to 56, "Velocidad" to 97)),
        Pokemon(818,"Inteleon", tiposRepositorio.AGUA, mapOf("Ps" to 72, "Ataque" to 95, "Defensa" to 67,"At. Esp" to 103, "Def. Esp" to 71, "Velocidad" to 122)),

        Pokemon(906,"Sprigatito", tiposRepositorio.PLANTA, mapOf("Ps" to 56, "Ataque" to 61, "Defensa" to 65,"At. Esp" to 48, "Def. Esp" to 45, "Velocidad" to 38)),
        Pokemon(907,"Floragato", tiposRepositorio.PLANTA, mapOf("Ps" to 61, "Ataque" to 78, "Defensa" to 95,"At. Esp" to 56, "Def. Esp" to 58, "Velocidad" to 57)),
        Pokemon(908,"Meowscarada", tiposRepositorio.PLANTA_SINIESTRO, mapOf("Ps" to 88, "Ataque" to 107, "Defensa" to 122,"At. Esp" to 74, "Def. Esp" to 75, "Velocidad" to 64)),

        Pokemon(909,"Fuecoco", tiposRepositorio.FUEGO, mapOf("Ps" to 40, "Ataque" to 45, "Defensa" to 40,"At. Esp" to 62, "Def. Esp" to 60, "Velocidad" to 60)),
        Pokemon(910,"Crocalor", tiposRepositorio.FUEGO, mapOf("Ps" to 59, "Ataque" to 59, "Defensa" to 58,"At. Esp" to 90, "Def. Esp" to 70, "Velocidad" to 73)),
        Pokemon(911,"Skeledirge", tiposRepositorio.FUEGO_FANTASMA, mapOf("Ps" to 75, "Ataque" to 69, "Defensa" to 72,"At. Esp" to 114, "Def. Esp" to 100, "Velocidad" to 104)),

        Pokemon(912,"Quaxly", tiposRepositorio.AGUA, mapOf("Ps" to 41, "Ataque" to 56, "Defensa" to 40,"At. Esp" to 62, "Def. Esp" to 44, "Velocidad" to 71)),
        Pokemon(913,"Quaxwell", tiposRepositorio.AGUA, mapOf("Ps" to 54, "Ataque" to 63, "Defensa" to 52,"At. Esp" to 83, "Def. Esp" to 56, "Velocidad" to 97)),
        Pokemon(914,"Quaquaval", tiposRepositorio.AGUA_LUCHA, mapOf("Ps" to 72, "Ataque" to 95, "Defensa" to 67,"At. Esp" to 103, "Def. Esp" to 71, "Velocidad" to 122)),
        )
}