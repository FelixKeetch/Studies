var divOne   = document.getElementById("divOne");
var divTwo   = document.getElementById("divTwo");
var divThree   = document.getElementById("divThree");
var divFour   = document.getElementById("divFour");
var divFive   = document.getElementById("divFive");
var speed = 2
;
function moveUp(elem) {       
    var pos = 80;
    var id = setInterval(frame, speed);
    function frame() {
      if (pos == 0) {
        clearInterval(id);
      } else {
        pos--; 
        elem.style.top = pos + "px";   
      }
    }    
  }
function moveDown(elem){
    var pos = 0;
    var id = setInterval(frame, speed);
    function frame() {
        if (pos == 80) {
          clearInterval(id);
        } else {
          pos++; 
          elem.style.top = pos + "px";   
        }
      }
}

function animation(){
  moveUp(divOne);
  setTimeout(moveUp, 70*speed, divTwo);
  setTimeout(moveUp, 140*speed, divThree);
  setTimeout(moveUp, 210*speed, divFour);
  setTimeout(moveUp, 280*speed, divFive);
  setTimeout(moveDown, 350*speed, divOne);
  setTimeout(moveDown, 420*speed, divTwo);
  setTimeout(moveDown, 490*speed, divThree);
  setTimeout(moveDown, 560*speed, divFour);
  setTimeout(moveDown, 630*speed, divFive);
}
window.setInterval(animation, 700*speed);
