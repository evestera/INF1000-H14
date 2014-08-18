set nocompatible
set encoding=utf-8

syntax on
set number

set tabstop=4
set shiftwidth=4
filetype plugin indent on

set backspace=2

map <F5> :call CompileRun()<CR>
func! CompileRun()
	exec "w"
	if &filetype == 'java'
		exec "!echo 'Compiling...' && javac % && echo 'Running...' && java %:t:r"
	endif
endfunc
