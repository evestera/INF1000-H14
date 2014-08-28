# Disse tre linjene er nødvendig på ifi-maskiner
# Hvis du bruker denne filen på din egen maskin kan du fjerne dem
if [ -f /local/lib/setupfiles/bashrc ]; then
	source /local/lib/setupfiles/bashrc
fi

# På ifi-maskiner ligger mye nyttig i /snacks/bin
export PATH=/snacks/bin:$PATH

# Blant annet en nyere versjon av emacs
alias emacs=emacs-newest

# Hvis du vil legge til programmer selv kan du med denne linjen legge dem i
# en mappe du kaller bin i hjemmeområdet ditt
export PATH=~/bin:$PATH

function prompt_command {
	if [[ $? = 0 ]]; then
		local COLOR="\033[0;32m"
	else
		local COLOR="\033[0;31m"
	fi
	local PRE="\n$COLOR"
	local POST="\033[m "
	export PS1="$PRE[\u.\h \w]$POST"
}
export PROMPT_COMMAND=prompt_command

# Endre til emacs om du foretrekker det
export EDITOR=vim
