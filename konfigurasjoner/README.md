# Konfigurasjonsfiler

Veldig mange linux-verktøy konfigureres med filer som starter med et punktum og legges i hjemmeområdet(~/).

For å installere disse konfigurasjonsfilene er det bare å kopiere følgende kommandoer inn i et terminalvindu.

Advarsel! Disse kommandoene overskriver eventuelle konfigurasjonsfiler du har der fra før!

#### .bashrc
    wget -O ~/.bashrc https://github.com/evestera/INF1000-H14/raw/master/konfigurasjoner/.bashrc

#### .inputrc
    wget -O ~/.inputrc https://github.com/evestera/INF1000-H14/raw/master/konfigurasjoner/.inputrc

#### .vimrc
    wget -O ~/.vimrc https://github.com/evestera/INF1000-H14/raw/master/konfigurasjoner/.vimrc

#### .emacs
    wget -O ~/.emacs https://github.com/evestera/INF1000-H14/raw/master/konfigurasjoner/.emacs

Hvis du vil bruke samme `.emacs`-fil som du har på Linux når du bruker Windows-maskinene på ifi gjør du følgende:

1. Åpne startmenyen og skriv "enviro"
2. Velg "Edit environment variables for your account"
3. Trykk New... sett Variable name til `HOME` og Variable value til `M:`

Dette ser dessverre ut til å måtte gjøres på nytt når man bruker en ny Windows-maskin.
