if [ -f ~/.bashrc ]; then
	source ~/.bashrc
fi

# På ifi-maskiner ligger mye nyttig i /snacks/bin
export PATH=/snacks/bin:$PATH

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
PROMPT_COMMAND=prompt_command

export EDITOR=vim