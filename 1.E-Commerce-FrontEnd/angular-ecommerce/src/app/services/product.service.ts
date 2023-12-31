import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Product } from '../common/product';
import { Observable, map } from 'rxjs';

 
@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private baseUrl='http://localhost:8080/api/products?size=100';
  constructor(private httpClint:HttpClient) { }
getProductList():Observable<Product[]>{
  return this.httpClint.get<GetResponse>(this.baseUrl).pipe(
    map(response=>response._embedded.products )
  );
}

}
interface GetResponse{
  _embedded:{
    products:Product[];
  }
}
