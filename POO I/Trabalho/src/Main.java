import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        //gastos
        ArrayList<String> listaTipoGasto = new ArrayList<>();
        ArrayList<Integer> listaDia = new ArrayList<>();
        ArrayList<Integer> listaMes = new ArrayList<>();
        ArrayList<Integer> listaAno = new ArrayList<>();
        ArrayList<Double> listaGasto = new ArrayList<>();
        ArrayList<String> listaTipoPagamento = new ArrayList<>();

        //ganhos
        ArrayList<String> listaTipoGanho = new ArrayList<>();
        ArrayList<Integer> listaDiaGanho = new ArrayList<>();
        ArrayList<Integer> listaMesGanho = new ArrayList<>();
        ArrayList<Integer> listaAnoGanho = new ArrayList<>();
        ArrayList<Double> listaValorGanho = new ArrayList<>();


        while (true) {
            System.out.println("Gestão Financeira\n" +
                    "-----------------------\n" +
                    "1 - Adicionar Gasto\n" +
                    "2 - Adicionar Ganho\n" +
                    "3 - Relatório de Gastos\n" +
                    "4 - Relatório de Ganhos\n" +
                    "5 - Relatório Mensal\n" +
                    "6 - Sair\n" +
                    "\n" +
                    "Selecione uma opção");

            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Tipos do gasto: \n" +
                            "1 - Habitação\n" +
                            "2 - Entretenimento\n" +
                            "3 - Alimentação\n" +
                            "4 - Transporte");

                    int tipoGasto = entrada.nextInt();
                    if (tipoGasto == 1){
                        listaTipoGasto.add("Habitação");
                    } else if (tipoGasto == 2){
                        listaTipoGasto.add("Entretenimento");
                    } else if (tipoGasto == 3){
                        listaTipoGasto.add("Alimentação");
                    } else if (tipoGasto == 4){
                        listaTipoGasto.add("Transporte");
                    }

                    System.out.println("Data:");
                    System.out.println("Dia:");
                    int diaGasto = entrada.nextInt();
                    listaDia.add(diaGasto);

                    System.out.println("Mes:");
                    int mesGasto = entrada.nextInt();
                    listaMes.add(mesGasto);

                    System.out.println("Ano:");
                    int anoGasto = entrada.nextInt();
                    listaAno.add(anoGasto);

                    System.out.println("Valor:");
                    double valorGasto = entrada.nextDouble();
                    //totalGastos += valorGasto;
                    listaGasto.add(valorGasto);
                    Gastos.adicionarGasto(valorGasto);

                    System.out.println("Forma de pagamento:\n" + "1 - Cheque\n" + "2 - Pix\n" + "3 - Débito\n");
                    int tipoPagamento = entrada.nextInt();

                    if (tipoPagamento == 1){
                        listaTipoPagamento.add("Cheque");
                    } else if (tipoPagamento == 2){
                        listaTipoPagamento.add("Pix");
                    } else if (tipoPagamento == 3){
                        listaTipoPagamento.add("Debito");
                    }
                    Gastos gastos = new Gastos(tipoGasto, diaGasto, mesGasto, anoGasto, valorGasto, tipoPagamento);

                    break;
                case 2:
                    System.out.println("2 - Adicionar Ganho\n");

                    System.out.println("Tipos do ganho: \n" +
                            "1 - Salario\n" +
                            "2 - Freelancer\n" +
                            "3 - Dividendos\n");

                    int tipoGanho = entrada.nextInt();
                    if (tipoGanho == 1){
                        listaTipoGanho.add("Salario");
                    } else if (tipoGanho == 2){
                        listaTipoGanho.add("Freelancer");
                    } else if (tipoGanho == 3){
                        listaTipoGanho.add("Dividendos");
                    }

                    System.out.println("Data: (DD-MM-AAAA)");
                    System.out.println("Dia: ");
                    int diaGanho = entrada.nextInt();
                    listaDiaGanho.add(diaGanho);

                    System.out.println("Mes:");
                    int mesGanho = entrada.nextInt();
                    listaMesGanho.add(mesGanho);

                    System.out.println("Ano:");
                    int anoGanho = entrada.nextInt();
                    listaAnoGanho.add(anoGanho);

                    System.out.println("Valor:");
                    double valorGanho = entrada.nextDouble();
                    listaValorGanho.add(valorGanho);
                    Ganhos.adicionarGanho(valorGanho);

                    Ganhos ganhos = new Ganhos(tipoGanho, diaGanho, mesGanho, anoGanho, valorGanho);

                    break;
                case 3:
                    System.out.println("3 - Relatório de Gastos\n");
                    System.out.println("Tipo  Data  Valor  Forma de Pagamento" );
                    GestaoFinanceira.relatorioGastos(listaTipoGasto, listaDia, listaMes, listaAno, listaGasto, listaTipoPagamento);

                    System.out.println("Total gasto: " + Gastos.getTotalGastos());
                    System.out.println();
                    break;
                case 4:
                    System.out.println("4 - Relatório de Ganhos\n");

                    System.out.println("Tipo  Data  Valor  " );
                    GestaoFinanceira.relatorioGanhos(listaTipoGanho, listaDiaGanho, listaMesGanho, listaAnoGanho, listaValorGanho);

                    System.out.println("Total ganho: " + Ganhos.getTotalGanho());
                    System.out.println();
                    break;
                case 5:
                    System.out.println("5 - Relatório Mensal\n");

                    GestaoFinanceira.relatorioMensal(Gastos.getTotalGastos(), Ganhos.getTotalGanho());

                    break;
                case 6:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
            }
        }

    }
}



