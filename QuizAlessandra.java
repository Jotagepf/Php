import java.util.Scanner;

public class QuizAlessandra {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontuacao = 0;

        System.out.println("Pergunta 1:");
        System.out.println("Pode-se definir a química orgânica como:");
        System.out.println("a) Uma área da química que estuda os compostos que contêm carbono.");
        System.out.println("b) Uma relação à molécula do Paracetamol.");
        System.out.println("c) O modo em que as plantas vivem no meio ambiente.");
        System.out.println("d) A química que estuda as frutas.");
        System.out.println("e) Uma área da química que estuda os compostos que contêm tungsténio..");

        String resposta = scanner.nextLine();

        if (resposta.equals("a")) {
            pontuacao++;
        } else {
            System.out,println("você errou")
        }
   
        System.out.println("Pergunta 2:");
        System.out.println("O nome do composto formado pela uniao dos radicais etil e terc-butil e:");
        System.out.println("a) 2,2-dimetil-butano");
        System.out.println("b) 2-metil-pentano");
        System.out.println("c) 3-metil-pentano");
        System.out.println("d) hexano");
        System.out.println("e) etil-propano");

        resposta = scanner.nextLine();

        if (resposta.equals("a")) {
            pontuacao++;
        }

        System.out.println("Pergunta 3:");
        System.out.println("O 2,2,5-trimetril-3-heptino e um hidrocarboneto cujas moleculas tem cadeia carbonica:");
        System.out.println("I. insaturada;");
        System.out.println("II. ramificada;");
        System.out.println("III. aromatica.");
        System.out.println("Dessas afirmacoes, somente:");
        System.out.println("a) I e correta.");
        System.out.println("b) II e correta.");
        System.out.println("c) III e correta.");
        System.out.println("d) I e II sao corretas.");
        System.out.println("e) I e III sao corretas.");

        resposta = scanner.nextLine();

        if (resposta.equals("d")) {
            pontuacao++;
        }

        System.out.println("Pergunta 4:");
        System.out.println("Tem a mesma formula molecular C5H10:");
        System.out.println("a) pentano e metil-ciclobutano.");
        System.out.println("b) 1-penteno e ciclopentano.");
        System.out.println("c) 2-pentino e ciclopenteno.");
        System.out.println("d) 2-metilbutano e dimetil-ciclopropano.");

        resposta = scanner.nextLine();

        if (resposta.equals("c")) {
            pontuacao++;
        }

        System.out.println("Pergunta 5:");
        System.out.println("Os representantes dos compostos dessa funcao organica sao oxigenados. Tem carater relativamente acido, porem, menos acido que os acidos carboxilicos. Em geral, eles sao pouco soluveis ou insoluveis em agua, mas os seus sais sao bem mais soluveis. Alguns sao utilizados como desinfetantes e na producao de resinas. As caracteristicas apontadas anteriormente estao associadas a funcao:");
        System.out.println("a) alcool.");
        System.out.println("b) aldeido.");
        System.out.println("c) cetona.");
        System.out.println("d) eter.");
        System.out.println("e) fenol.");

        resposta = scanner.nextLine();

        if (resposta.equals("e")) {
            pontuacao++;
        }

        System.out.println("Pergunta 6:");
        System.out.println("Qual das afirmativas a seguir sobre funcoes organicas esta incorreta?");
        System.out.println("a) Todo hidrocarboneto possui apenas carbono e hidrogenio.");
        System.out.println("b) Os haletos organicos sao derivados da substituicao de um ou mais hidrogenios por atomos de halogenios.");
        System.out.println("c) Os aldeidos possuem o grupo carbonila entre dois atomos de carbono.");
        System.out.println("d) Tanto as cetonas quanto os aldeidos possuem o grupo carbonila.");
        System.out.println("e) As aminas sao derivadas da amonia pela substituicao de um, dois ou tres hidrogenios por cadeias carbonicas.");

        resposta = scanner.nextLine();

        if (resposta.equals("c")) {
            pontuacao++;
        }

        System.out.println("Pergunta 7:");
        System.out.println("Uma planta medicinal utilizada para regular a glicemia e encontrada na regiao amazonica, sendo popularmente conhecida como pata-de-vaca.");
        System.out.println("A especie que funciona como uma ?insulina vegetal? possui entre seus compostos quimicos um alcano, cuja formula contem 74 atomos de hidrogenio. Portanto, o numero de atomos de carbono presentes na cadeia carbonica e:");
        System.out.println("a) 33");
        System.out.println("b) 34");
        System.out.println("c) 35");
        System.out.println("d) 36");
        System.out.println("e) 37");

        resposta = scanner.nextLine();

        if (resposta.equals("c")) {
            pontuacao++;
        }

        System.out.println("Pergunta 8:");
        System.out.println("Alcinos sao hidrocarbonetos:");
        System.out.println("a) alifaticos saturados.");
        System.out.println("b) aliciclicos saturados.");
        System.out.println("c) alifaticos insaturados com dupla ligacao.");
        System.out.println("d) aliciclicos insaturados com tripla ligacao.");
        System.out.println("e) alifaticos insaturados com tripla ligacao.");

        resposta = scanner.nextLine();

        if (resposta.equals("e")) {
            pontuacao++;
        }

        System.out.println("Pergunta 9:");
        System.out.println("O octano e um dos principais constituintes da gasolina, que e uma mistura de hidrocarbonetos. A formula molecular do octano e:");
        System.out.println("a) C8H18");
        System.out.println("b) C8H16");
        System.out.println("c) C8H14");
        System.out.println("d) C12H24");
        System.out.println("e) C18H38");

        resposta = scanner.nextLine();

        if (resposta.equals("a")) {
            pontuacao++;
        }

        System.out.println("Pergunta 10:");
        System.out.println("Considere as afirmacoes seguintes sobre hidrocarbonetos.");
        System.out.println("I) Hidrocarbonetos sao compostos organicos constituidos somente de carbono e hidrogenio.");
        System.out.println("II) Sao chamados de alcenos somente os hidrocarbonetos insaturados de cadeia linear.");
        System.out.println("III) Cicloalcanos sao hidrocarbonetos alifaticos saturados de formula geral CnH2n.");
        System.out.println("IV) Sao hidrocarbonetos aromaticos: bromobenzeno, p-nitrotolueno e naftaleno.");
        System.out.println("Sao corretas as afirmacoes:");
        System.out.println("a) I e III, apenas.");
        System.out.println("b) I, III e IV, apenas.");
        System.out.println("c) II e III, apenas.");
        System.out.println("d) III e IV, apenas.");
        System.out.println("e) I, II e IV, apenas.");

        resposta = scanner.nextLine();

        if (resposta.equals("b")) {
            pontuacao++;
        }

        System.out.println("Pergunta 11:");
        System.out.println("O gas liquefeito de petroleo, GLP, e uma mistura de propano, C3H8, e butano, C4H10. Logo, esse gas e uma mistura de hidrocarbonetos da classe dos:");
        System.out.println("a) alcanos.");
        System.out.println("b) alcenos.");
        System.out.println("c) alcinos.");
        System.out.println("d) cicloalcanos.");
        System.out.println("e) cicloalcenos.");

        resposta = scanner.nextLine();

        if (resposta.equals("a")) {
            pontuacao++;

        }
        System.out.println("Pergunta 12:");
        System.out.println("Determine o nome do alcano que apresenta dez atomos de carbono e ramificacao nos carbonos 2 e 5 da cadeia principal:");
        System.out.println("a) 2,5-metildecano.");
        System.out.println("b) 2,5-dimetildecano.");
        System.out.println("c) 2,5-dimetiloctano.");
        System.out.println("d) 2-etil-5-etil-heptano.");
        System.out.println("e) decano.");

        resposta = scanner.nextLine();

        if (resposta.equals("d")) {
            pontuacao++;
        }

        System.out.println("Pergunta 13:");
        System.out.println("A substancia 2-metilbutano tem a formula molecular:");
        System.out.println("a) C4H6");
        System.out.println("b) C4H8");
        System.out.println("c) C4H10");
        System.out.println("d) C5H10");
        System.out.println("e) C5H12");

        resposta = scanner.nextLine();

        if (resposta.equals("e")) {
            pontuacao++;
        }

        System.out.println("Pergunta 14:");
        System.out.println("No composto abaixo as quantidades de atomos de carbono primario, secundario e terciario sao,respectivamente:");
        System.out.println();
        System.out.println("                 CH3");
        System.out.println("                  |");
        System.out.println("                 CH2");
        System.out.println("                  |");
        System.out.println("H3C -  CH2 - CH - CH - CH - CH3");
        System.out.println("        |         |    |");
        System.out.println("       CH3       CH3  CH2");
        System.out.println("                       |");
        System.out.println("                      CH2");
        System.out.println("                       |");
        System.out.println("                      CH3");
         System.out.println();
        System.out.println("a) 5, 2 e 3");
        System.out.println("b) 3, 5 e 2");
        System.out.println("c) 4, 3 e 5");
        System.out.println("d) 6, 4 e 4");
        System.out.println("e) 5, 6 e 5");

        resposta = scanner.nextLine();

        if (resposta.equals("d")) {
            pontuacao++;
        }

             System.out.println("Pergunta 15:");
        System.out.println("O carbono tem como principal caracteristica quatro ligações duplas");
        System.out.println("a) verdadeiro");
        System.out.println("b) falso");

        resposta = scanner.nextLine();

        if (resposta.equals("b")) {
            pontuacao++;

         System.out.println("Pergunta 16 :");
        System.out.println("O linalol, substância isolada do óleo de alfazema, apresenta a seguinte fórmula estrutural:");
        System.out.println();
        System.out.println("                                 OH ");
        System.out.println("                                 | ");
        System.out.println("  H3C - C = CH - CH2 - CH2 - C - CH = CH2 ");
        System.out.println("        |                        | ");
        System.out.println("       CH3                      CH3  ");
        System.out.println();
        System.out.println("a) acíclica, normal, insaturada e homogênea.");
        System.out.println("b) acíclica, ramificada, insaturada e homogênea.");
        System.out.println("c) alicíclica, ramificada, insaturada e homogênea.");
        System.out.println("d) alicíclica, normal, saturada e heterogênea.");
        System.out.println("e) acíclica, ramificada, saturada e heterogênea.");

        resposta = scanner.nextLine();

        if (resposta.equals("b")) {
            pontuacao++;

         System.out.println("Pergunta 17:");
        System.out.println("Qual a função orgânica de um hidrocarboneto sabendo que: insaturado aberto e sem ramificações");
        System.out.println("a) Alpacino");
        System.out.println("b) Alceno");
        System.out.println("c) Alcano");
        System.out.println("d) Alcino");

        resposta = scanner.nextLine();

        if (resposta.equals("b")) {
            pontuacao++;

            System.out.println("Pergunta 18:");
            System.out.println("Em relacao ao composto de formula estrutural H3C-CH2-CH2-CH3, considere as afirmacoes:");
            System.out.println("I. e um alcano;");
            System.out.println("II. apresenta somente carbonos primarios em sua estrutura;");
            System.out.println("III. apresenta uma cadeia carbonica normal;");
            System.out.println("IV. tem formula molecular C4H10.");
            System.out.println("Sao corretas somente:");
            System.out.println("a) I e II");
            System.out.println("b) I e III");
            System.out.println("c) II, III e IV");
            System.out.println("d) I, III e IV");
            System.out.println("e) I e IV");

        resposta = scanner.nextLine();

        if (resposta.equals("d")) {
            pontuacao++;

                System.out.println("Pergunta 19:");
        System.out.println("Sobre as formas de classificação das cadeias carbônicas é correto afirmar:");
        System.out.println("a) O ciclobutano possui cadeia aberta.");
        System.out.println("b) Cadeia ramificada são aquelas que possuem 4 ou mais extremidades ");
        System.out.println("c) Cadeia normal, reta ou linear ocorre quando só existem carbonos primários e secundários na cadeia.");
        System.out.println("d) Cadeia homogênea é quando possui apenas uma fase.");

        resposta = scanner.nextLine();

        if (resposta.equals("b")) {
            pontuacao++;
            
                System.out.println("Pergunta 20:");
        System.out.println("Qual a formula molecular do butano?");
        System.out.println("a) C4H8");
        System.out.println("b) C4H9 ");
        System.out.println("c) C4H10");
        System.out.println("d) C4H11");

        resposta = scanner.nextLine();

        if (resposta.equals("c")) {
            pontuacao++;

             System.out.println("Pergunta 21:");
        System.out.println("Identifique o número de carbonos primários existentes na dimetil-6-etil-nonano:");
        System.out.println("a) 3");
        System.out.println("b) 4");
        System.out.println("c) 5");
        System.out.println("d) 6");
        System.out.println("e) 7");

        resposta = scanner.nextLine();

        if (resposta.equals("c")) {
            pontuacao++;

              System.out.println("Pergunta 22:");
        System.out.println("O que caracteriza um composto orgânico saturado?");
        System.out.println("a) Possui apenas ligações duplas");
        System.out.println("b) Possui apenas ligações simples ");
        System.out.println("c)  Contém um grupo funcional amida");
        System.out.println("d) Possui apenas ligações triplas");

        resposta = scanner.nextLine();

        if (resposta.equals("b")) {
            pontuacao++;

        }

        System.out.println("Pontuacao final: " + pontuacao + " de 22");
    } 
}
}
}
}
        }
    }
}
}