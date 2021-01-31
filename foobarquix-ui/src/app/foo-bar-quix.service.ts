import { Injectable, Injector } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {
  constructor(private http: HttpClient, private injector: Injector) { }
  
  public convertNumber(inputNumber: Number):Observable<object> {
    const serveur = this.injector.get('SERVER_URL');
    console.log("serveur:" + serveur);
    return this.http.get<object>(serveur+'/foo-bar-quix/'+ inputNumber);
  }

}
