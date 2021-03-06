# URI

## Goal

This repository has the goal of practicing programming through the solution of challenges found at [URI](https://www.beecrowd.com.br/judge/pt).

## Languages:

- Javascript
- Java
- Clojure
- SQL

## Editor

In order to better practice code writing, all solutions here were developed using [VIM](https://www.vim.org/download.php).

I have recently started to use this text editor because it gives no help when it comes to code autocomplete and I have found myself struggling to do simple things, specially with Java, therefore by using VIM and repeating the code over and over again I hope to learn even more about Java and all the other listed languages to be used.

## Searching for files in Vim

### Searching through the terminal

To search for a file in VIM you may use:

```bash
:e <filesname>
```

The problem with this approach is that you have to remember the exactly and often you don’t know it.

In addition to that you can write `:e` and the press tab, so the terminal will make suggestions of file you may navigate to, however that isn’t efficient as well.

### Searching through the file explorer

To open up file explorer try:

```bash
:e .
```

## Running Clojure codes

You may find the official documentation [here](https://clojure.org/guides/install_clojure#brew).

In order to run Clojure codes you need to have:

- Java
- Bash
- Curl: stands for *client URL*, it is a command line tool that developers use to transfer data to and from a server.
- Rlwrap: utility which provides a command history and editing of keyboard input for any other command. This is a really handy addition to SQL*Plus and RMAN on Linux
- Homebrew: package manager

Installing the language:

```bash
brew install clojure/tools/clojure
```

Then you may use the following script to complete the installation:

```bash
curl -O https://download.clojure.org/install/linux-install-1.11.1.1113.sh
chmod +x linux-install-1.11.1.1113.sh
sudo ./linux-install-1.11.1.1113.sh
```
