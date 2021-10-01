package lab.eugene.step2postgress.model;

import javax.persistence.*;

@Entity
@Table(name = "sankoreProducts")
public class SankoreProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name ="product_name")
    private String productName;
    @Column(name="product_dept")
    private String productDept;
    @Column(name="product_net_worth")
    private String futureNetWorth;
    @Column(name="product_CEO")
    private String productCEO;


    public SankoreProducts() {
        super();
    }

    public SankoreProducts(Integer id, String productName, String productDept, String futureNetWorth, String productCEO) {
        this.id = id;
        this.productName = productName;
        this.productDept = productDept;
        this.futureNetWorth = futureNetWorth;
        this.productCEO = productCEO;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDept() {
        return productDept;
    }

    public void setProductDept(String productDept) {
        this.productDept = productDept;
    }

    public String getFutureNetWorth() {
        return futureNetWorth;
    }

    public void setFutureNetWorth(String futureNetWorth) {
        this.futureNetWorth = futureNetWorth;
    }

    public String getProductCEO() {
        return productCEO;
    }

    public void setProductCEO(String productCEO) {
        this.productCEO = productCEO;
    }
}
