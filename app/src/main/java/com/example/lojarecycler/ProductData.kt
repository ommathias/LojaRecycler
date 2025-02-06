package com.example.lojarecycler

object ProductData {

    fun getProducts(): List<Product> {
        return listOf(
            Product(
                name = "Geladeira",
                price = 3000.00,
                stock = 10,
                imageId = R.drawable.geladeira,
                description = "Uma geladeira super espaçosa para guardar suas guloseimas e manter tudo sempre fresquinho!"
            ),
            Product(
                name = "Notebook",
                price = 2500.00,
                stock = 120,
                imageId = R.drawable.notebook,
                description = "Notebook ágil e leve, perfeito para trabalhar e estudar."
            ),
            Product(
                name = "Pneu para Trator",
                price = 800.00,
                stock = 4,
                imageId = R.drawable.pneu,
                description = "Robusto e resistente, ideal para deixar seu trator preparado para qualquer aventura no campo."
            ),
            Product(
                name = "Fogão",
                price = 1200.00,
                stock = 344,
                imageId = R.drawable.fogao,
                description = "O fogão que vai despertar o chef que existe em você! Chega de miojo sem graça."
            ),
            Product(
                name = "Míssil Hipersônico Continental",
                price = 20000000.00,
                stock = 500,
                imageId = R.drawable.missil,
                description = "Mísseis são armas de dissuasão, mas se precisar usar, funciona."
            ),
            Product(
                name = "Espada",
                price = 950.00,
                stock = 10,
                imageId = R.drawable.espada,
                description = "Uma bela Katana para enfeitar sua sala ou afungentar larápios"
            ),
            Product(
                name = "Celular de Boy",
                price = 2300.00,
                stock = 6,
                imageId = R.drawable.celular,
                description = "Celular com várias câmeras das quais você mal utilizará uma."
            ),
            Product(
                name = "Computador Desktop",
                price = 2000.00,
                stock = 200,
                imageId = R.drawable.computador,
                description = "Potente e versátil, esse desktop é perfeito para programar, jogar e fazer aquela planilha que nunca acaba."
            ),
            Product(
                name = "MAKITA!!",
                price = 700.00,
                stock = 4,
                imageId = R.drawable.makita,
                description = "A ferramenta que seu vizinho adora."
            ),
            Product(
                name = "Lavadeira",
                price = 1500.00,
                stock = 2,
                imageId = R.drawable.lavadeira,
                description = "Sua roupa nunca esteve tão bem tratada. Uma lavadeira que transforma a rotina de lavar roupas em algo quase divertido!"
            ),
            Product(
                name = "Micro Ondas",
                price = 400.00,
                stock = 500,
                imageId = R.drawable.microondas,
                description = "Aquece seu lanche num instante e salva aqueles momentos de fome repentina com muito estilo."
            )
        )
    }
}
