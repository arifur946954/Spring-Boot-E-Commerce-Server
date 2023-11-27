export class Product {
    constructor(
        public sku:string,
        public name:string,
        public description:string,
        public unitPrice:string,
        public imageUrl:string,
        public active:boolean,
        public unitStock:number,
        public dateCreated:Date,
        public lastUpdate:Date,
        ){

    }
}