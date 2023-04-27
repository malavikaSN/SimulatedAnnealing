package sa;

import java.awt.Color;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/*
* GraphTour.java
* Plots graphical results of the tour.
* 
*/

public class GraphTour {
	
	
	 /**
     * Method to plot results of tour in graph
     * @param tour to be displayed as graphical results
     * @param tourSolution title of the graph
     */
    public GraphTour(Tour tour, String tourSolution) {
    	XYSeries dotSeries = new XYSeries("Cities");
        XYSeries lineSeries = new XYSeries("Tour");
        
        // Retrieve x and y coordinates of each city in the tour
        for (int i = 0; i < tour.tourSize(); i++) {
            City city = tour.getCity(i);
            dotSeries.add(city.getX(), city.getY());
            lineSeries.add(city.getX(), city.getY());
        }
        
        City firstCity = tour.getCity(0);
        dotSeries.add(firstCity.getX(), firstCity.getY());
        lineSeries.add(firstCity.getX(), firstCity.getY());

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(dotSeries);
        dataset.addSeries(lineSeries);

        JFreeChart chart = ChartFactory.createScatterPlot(
                tourSolution,
                "X", "Y",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        XYPlot plot = chart.getXYPlot();

        // To generate dots in graphical results that represent cities
        XYLineAndShapeRenderer dotRenderer = new XYLineAndShapeRenderer();
        dotRenderer.setSeriesLinesVisible(0, false);
        dotRenderer.setSeriesShapesVisible(0, true);
        dotRenderer.setSeriesPaint(0, Color.BLACK);
        
        plot.setRenderer(0, dotRenderer);
        
        
        ChartFrame frame = new ChartFrame("Chart", chart);
        frame.pack();
        frame.setVisible(true);
    }
}
