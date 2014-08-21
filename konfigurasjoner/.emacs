;; Fix indenting
(setq-default indent-tabs-mode nil)
(setq-default tab-width 4)
(electric-indent-mode 1)

;; Always use utf-8
(prefer-coding-system 'utf-8)

;; Show line numbers
(global-linum-mode t)
(if (not (display-graphic-p))
  (setq linum-format "%d "))

