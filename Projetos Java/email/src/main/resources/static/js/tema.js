const toggleButton = document.getElementById("toggleTheme");
const themeIcon = document.getElementById("themeIcon");
const body = document.body;

function aplicarTema(tema) {
    if (tema === "dark") {
        body.classList.add("dark");
        body.classList.remove("light");
        themeIcon.src = "/img/sol.svg";
    } else {
        body.classList.add("light");
        body.classList.remove("dark");
        themeIcon.src = "/img/lua.svg";
    }
}

const temaSalvo = localStorage.getItem("tema");
if (temaSalvo) {
    aplicarTema(temaSalvo);
} else {
    aplicarTema("dark");
}

toggleButton.addEventListener("click", () => {
    if (body.classList.contains("dark")) {
        aplicarTema("light");
        localStorage.setItem("tema", "light");
    } else {
        aplicarTema("dark");
        localStorage.setItem("tema", "dark");
    }
});

document.addEventListener("DOMContentLoaded", function () {
    const msgSucesso = document.getElementById("msgSucesso");
    const msgErro = document.getElementById("msgErro");

    function esconderMensagem(msg) {
        if (msg) {
            setTimeout(() => {
                msg.style.transition = "opacity 0.5s";
                msg.style.opacity = "0";
                setTimeout(() => msg.remove(), 500); 
            }, 5000);
        }
    }

    esconderMensagem(msgSucesso);
    esconderMensagem(msgErro);
});