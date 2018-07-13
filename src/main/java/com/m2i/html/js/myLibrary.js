function circleArea(rayon) {
    return Math.PI * rayon * rayon;
}

function display(tab) {
    for(var i=0;i<tab.length;i++){
        document.write(tab[i]+" ");
    }

}

function sum(tab) {
    var res=0;
    for(var i=0;i<tab.length;i++){
       res=res+tab[i];
    }
    return res;
}

function max(tab) {
   var max=tab[0];
   for (var i=1;i<tab.length;i++){
       if (tab[i]>max){
           max=tab[i];
       }
   }
   return max;

}

function avg(tab) {
    return sum(tab)/tab.length;

}

function isPrimeNumber(i) {
    var boo=true;
    if (i<2){
        boo=false;
    } else {
        for (var j=2;j<i;j++){
            if ((i%j)==0){
                boo=false;
                break;
            }
        }
    }
    return boo;

}

function getPrimeNumbers(tab) { 
    // var prime=[];
    // for (var i=0;i<tab.length;i++){
    //     if (isPrimeNumber(tab[i])){
    //         prime.push(tab[i]);
    //     }
    // }
    // return display(prime);
    return tab.filter(i=>isPrimeNumber(i));
}

