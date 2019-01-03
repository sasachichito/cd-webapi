Feature: 登録したユーザーの情報を閲覧する

  Scenario: ユーザー「Mom」を登録
    Given ユーザー「Mom」は未登録
    When ユーザー「Mom」を登録
    Then ユーザー「Mom」の情報を閲覧できる