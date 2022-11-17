package product_app

class Product {

    String code
    String skuCode
    Date createdOn

    static mapping = {
        table("mst_product")
        version(false)
        skuCode column: 'SKU_CODE'
    }

    static constraints = {
        skuCode nullable: true
    }
}
