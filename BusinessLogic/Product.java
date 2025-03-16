package BusinessLogic;

public class Product {
    public String name;
    public String SerialNum;
    public double SalePrice;
    public String Brand;
    public Category ProductCategory;
    public double Cost;
    public int AvailaibleUnits;
    
    public Product(String name, String SerialNum, int AvailaibleUnits, String Brand, String Category, double Cost, double SalePrice) {
        this.name = name;
        this.SerialNum = SerialNum;
        this.SalePrice = SalePrice;
        this.Brand = Brand;
        setCategory(Category);
        this.Cost = Cost;
        this.AvailaibleUnits = AvailaibleUnits;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSerialNum() {
		return SerialNum;
	}

	public void setSerialNum(String serialNum) {
		SerialNum = serialNum;
	}

	public double getSalePrice() {
		return SalePrice;
	}

	public void setSalePrice(double salePrice) {
		SalePrice = salePrice;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public Category getCategory() {
		return ProductCategory;
	}

	public void setCategory(String category) {
		this.ProductCategory = Category.valueOf(category.toUpperCase());
	}

	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) {
		Cost = cost;
	}

	public int getAvailaibleUnits() {
		return AvailaibleUnits;
	}

	public void setAvailaibleUnits(int availaibleUnits) {
		AvailaibleUnits = availaibleUnits;
	}

	@Override
	public String toString() {
		return "Product{\n\tname: " + name + "\n\tSerialNum: " + SerialNum + "\n\tSalePrice: " + SalePrice + "\n\tBrand: " + Brand
				+ "\n\tCategory: " + ProductCategory + "\n\tCost: " + Cost + "\n\tAvailaibleUnits: " + AvailaibleUnits + "\n}";
	}
    
    
   

}