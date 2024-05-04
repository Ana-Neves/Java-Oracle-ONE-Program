public class DiasDaSemana {
    public static void main(String[] args) {
        int dia = 3;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}

/* Uma alternativa ao if/else é o switch case, que é uma estrutura de controle de fluxo que permite executar diferentes ações com base no valor de uma expressão. É uma forma mais simplificada e legível de escrever vários blocos if/else encadeados.
A expressão é uma variável ou uma expressão de código que será avaliada. Cada case é uma possível condição que pode ser atendida pela expressão. Quando a expressão é igual ao valor especificado em um determinado case, o código correspondente a esse case será executado. A palavra-chave break é usada para sair do switch case após a execução do código correspondente.
Vantagens do switch case:

Em resumo, o switch case torna o código mais fácil de entender e mais legível, em comparação ao if/else, especialmente quando há várias condições possíveis.
 */
