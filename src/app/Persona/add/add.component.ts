import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Persona } from 'src/app/Model/Persona';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(private router:Router, private service:ServiceService) { }

  persona:Persona = new Persona;

  ngOnInit(): void {
  }

  Guardar(){
    this.service.createPersona(this.persona)
    .subscribe(data=>{
      if(this.persona.Stock < this.persona.Cantidad){
        alert("El stock no debe ser menor a la cantidad")
      }else{
        alert("Se Agrego con Exito...!!!");
        this.router.navigate(["listar"]);
      }
    })
  }

}
