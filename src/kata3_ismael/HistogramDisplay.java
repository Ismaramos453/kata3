package kata3_ismael;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class HistogramDisplay extends ApplicationFrame{
    private final Histogram<String> histogram;
        
    
    public HistogramDisplay(String title, Histogram<String>histogram){
        super(title);
        this.histogram = histogram;
        this.setContentPane(createPanel());
        pack();
    }
    public void execute (){
        setVisible(true);
    }
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histogram Display",
                                                        "Dominios emails", "Nº emails",  
                                                        dataSet, PlotOrientation.VERTICAL, 
                                                        false, false, rootPaneCheckingEnabled);
        return chart;
        
    } 

    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for (String key : histogram.keySet()) {
            dataSet.addValue(histogram.get(key), "", key);
        }     
        
        
        return dataSet;
    
    }
    
}
