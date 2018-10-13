import java.util.Scanner;
/**
 * Class for stock.
 */
class Stock implements Comparable<Stock> {
    /**
     * company.
     */
    private String company;
    private Double percentilechange;
    public Stock(String company, Double percentilechange) {
        this.company = company;
        this.percentilechange = percentilechange;
    }
    public Double getperecentilechange() {
        return percentilechange;
    }
    public String getcompany() {
        return company;
    }
    public String toString() {
        return company + " " + percentilechange;
    }
    public int compareTo(final Stock that) {
        if (this.getperecentilechange() < that.getperecentilechange()) {
            return -1;
        }
        if (this.getperecentilechange() > that.getperecentilechange()) {
            return 1;
        }
        if (this.getcompany().compareTo(that.getcompany()) > 0) {
            return 1;
        }
        if (this.getcompany().compareTo(that.getcompany()) < 0) {
            return -1;
        }
        return 0;
    }
}