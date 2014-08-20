set nocompatible
set encoding=utf-8

syntax on
set number

set tabstop=4
set shiftwidth=4
filetype plugin indent on

set backspace=2
set whichwrap+=<,>,h,l,[,]

set laststatus=2

set statusline=\             "initial spacing
set statusline+=%{&ff}       "file format
set statusline+=%y           "file type
set statusline+=\ %{&enc}    "encoding
set statusline+=\ %<%F       "full path
set statusline+=\ %#error#   "switch to error-colors
set statusline+=%m           "modified flag
set statusline+=%*           "switch back to normal colors
set statusline+=%=           "right align stuff after this
set statusline+=%c           "cursor column
set statusline+=\ %l/%L      "cursor line/total lines
set statusline+=\            "final spacing

map <F5> :call CompileRun()<CR>
func! CompileRun()
	exec "w"
	if &filetype == 'java'
		exec "!echo 'Compiling...' && javac % && echo 'Running...' && java %:t:r"
	endif
endfunc
