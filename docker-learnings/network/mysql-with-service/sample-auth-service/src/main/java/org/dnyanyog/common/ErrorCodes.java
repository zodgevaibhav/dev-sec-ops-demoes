package org.dnyanyog.common;

public enum ErrorCodes {
  USER_ADD_SUCCESS("0000", "User created successfuly"),
  USER_UPDATE_SUCCESS("0000", "User update successfuly"),
  USER_LOGIN_SUCCESS("0000", "User update successfuly");
  String code, message;

  ErrorCodes(String string, String string2) {}
}
