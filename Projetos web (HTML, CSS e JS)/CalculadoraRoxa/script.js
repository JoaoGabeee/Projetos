const display = document.getElementById('display');

    function adicionar(valor){
      if(display.value === 'Erro') display.value = '';
      display.value += valor;
    }

    function calcular(){
      try{
        const resultado = eval(display.value);
        display.value = (resultado === undefined || Number.isNaN(resultado)) ? 'Erro' : String(resultado);
      } catch (e){
        display.value = 'Erro';
      }
    }

    function limpar(){
      display.value = '';
    }
    window.addEventListener('keydown', (e)=>{
      if(e.key >= '0' && e.key <= '9') adicionar(e.key);
      else if (e.key === '.' || e.key === '+' || e.key === '-' || e.key === '*' || e.key === '/') adicionar(e.key);
      else if (e.key === 'Enter') calcular();
      else if (e.key === 'Backspace') display.value = display.value.slice(0,-1);
      else if (e.key.toLowerCase() === 'c') limpar();
    });