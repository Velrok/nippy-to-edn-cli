# nippy-to-edn

A mini cli tool to convert nippy received via STDIN into edn on STDOUT.

Usage

```bash
cat frozen.nippy | nippy-to-edn
```

## install

1. Checkout: `git clone https://github.com/Velrok/nippy-to-edn-cli.git`
1. Compile: `lein uberjar` ; Assumes you have leiningen installed
1. Install: `./install.sh` ; This assumes you have a `$HOME/bin` folder which is on your `PATH`