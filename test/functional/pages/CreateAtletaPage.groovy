package pages
import geb.Page
/**
 * Created by ess on 05/10/15.
 */
class CreateAtletaPage extends Page {
    def titulo = "Criar Atleta"
    static url = "/GA/atleta/create"

    static at = {
        title ==~ titulo
    }

    def fillAtletaDetails(String nome, String email, String telefone, String cpf, String rg, String altura, String peso, String posicao, String categoria, boolean alojamento){
        $("form").nome = nome
        $("form").email = email
        $("form").telefone = telefone
        $("form").cpf = cpf
        $("form").rg = rg
        $("form").altura = altura
        $("form").peso = peso
        $("form").posicao = posicao
        $("form").categoria = categoria
        $("form").alojamento = alojamento


    }

    def selectCreateAtleta(){
        $("input", name: "create").click()
    }


}