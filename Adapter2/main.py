from modules.LogAdapterClass import LogAdapter
from modules.OldLoggerClass import OldLogger


def main():
    old = OldLogger()
    log = LogAdapter(old)

    log.log("main", "Hello, world!")


main()
