import React from 'react';
import ReactDOM from 'react-dom';
import '../src/css/main.css';
import 'bootstrap/dist/css/bootstrap.css';

//COMPONENTS


const element = (

  <div class="l-container">
    <h1>Project Your Own Pizza</h1>
    <p>Dit is een pizza app</p>
  </div>

);

console.log(element);


ReactDOM.render(element, document.getElementById('root'));
