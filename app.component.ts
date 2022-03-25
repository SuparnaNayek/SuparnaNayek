import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template:
  <p>{{name}}</p>
  <h2>
  <input type="text" bind-value=name/>
  
  styleUrl: ['./app.component.css']
  Styles:['h2{color:green}]
})
export class AppComponent {
	public isDisabled=false;
	title='hello';
	name='suparna';
	greetUser(){
		return this.title+'coders';
	}
}