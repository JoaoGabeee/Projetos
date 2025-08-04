 const toggleButton = document.getElementById("toggleTheme");
    const themeIcon = document.getElementById("themeIcon");
    const body = document.body;


    toggleButton.addEventListener("click", () => {
        body.classList.toggle("dark");
        body.classList.toggle("light");

        if (body.classList.contains("dark")) {
            themeIcon.src = "/img/sol.svg";
        } else {
            themeIcon.src = "/img/lua.svg";
        }
    });