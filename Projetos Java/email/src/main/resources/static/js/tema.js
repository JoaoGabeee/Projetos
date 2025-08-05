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

window.addEventListener("DOMContentLoaded", function () {
    const msg = document.getElementById("msgSucesso");
    if (msg) {
        setTimeout(() => {
            msg.classList.add("fade-out");
            setTimeout(() => {
                msg.style.display = "none";
            }, 500); // tempo do fade-out
        }, 3000); // espera 3 segundos antes de sumir
    }
});