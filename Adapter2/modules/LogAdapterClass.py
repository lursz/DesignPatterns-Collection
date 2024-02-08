import datetime


class LogAdapter:
    def __init__(self, old_logger) -> None:
        self.old_logger = old_logger

    def log(self, module, message):
        self.old_logger.log(f"{datetime.datetime.now}{module}: {message}")