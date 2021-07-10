package fundamentos;

import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Gravacao {

    public static void  main (String[] args) throws IOException {
        String[] cabecalho = {"Nome","Idade","Telefone"};

        List<String[]> linhas = new ArrayList<>(); //Cria tabela vazia
        linhas.add(new String[]{"Beatriz","29","11988464621"});
        linhas.add(new String[]{"Gilmo","25","34945646629"});
        linhas.add(new String[]{"Silas","21","2198464627"});

        Writer escritor = Files.newBufferedWriter(Paths.get("src/main/resources/logs/clientes.csv"));

        CSVWriter escritorCSV = new CSVWriter(escritor);

        escritorCSV.writeNext(cabecalho);
        escritorCSV.writeAll(linhas);

        escritorCSV.flush();

        escritor.close();

    }
}
