package service;

import dto.Productdto;
import model.Market;
import model.Product;

public class ProductService {
    public  int index=0;
    public Product[] productList;
    public ProductService(int size){
        productList=new Product[size];

    }
    public boolean addProduct(Productdto productdto, Market market){
        if(isHasProduct(productdto,market)){
            return false;
        }

        Product product=new Product(productdto.name, productdto.balance, productdto.quantity,market.id);
        productList[index++]=product;
        return true;
    }

    public boolean isHasProduct(Productdto productdto, Market market){
        for(Product product: productList){
            if(product!=null){
                if(product.name.equals(productdto.name) && product.marketId==market.id){
                    return false;
                }
            }
        }
        return true;
    }


}
