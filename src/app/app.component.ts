import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'FrontEnd';

  constructor(private router:Router){}

  Listar(){
    this.router.navigate(["listar"]);
    console.log("listar");
  }

  Nuevo(){
    this.router.navigate(["add"]);
    console.log("agregar");
  }
}