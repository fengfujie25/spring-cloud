package algorithm.miki;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

import java.io.BufferedReader;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * @Auther: fujie.feng
 * @Date: 2019-03-18
 */
public class ReadCsvThread implements Callable<List<Object>> {

    private BufferedReader bufferedReader;

    private Class<Object> clazz;

    public ReadCsvThread(BufferedReader bufferedReader, Class<Object> clazz) {
        this.bufferedReader = bufferedReader;
        this.clazz = clazz;
    }

    @Override
    public List<Object> call() throws Exception {
        CSVReader reader = new CSVReader(bufferedReader);

        HeaderColumnNameMappingStrategy strategy = new HeaderColumnNameMappingStrategy();
        strategy.setType(clazz);
        CsvToBean csvToBean = new CsvToBeanBuilder(reader)
                .withSeparator(',')
                .withQuoteChar('\'')
                .withMappingStrategy(strategy).build();
        return csvToBean.parse();
    }
}
