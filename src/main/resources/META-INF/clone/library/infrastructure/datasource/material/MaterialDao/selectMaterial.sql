select
    所蔵品目.所蔵品目番号 as entryNumber
   ,所蔵品目.タイトル     as title
   ,所蔵品目.著者        as workOf
   ,所蔵品目.所蔵品目種別  as entryType
from
    所蔵品目
where
    所蔵品目.所蔵品目番号 = /* entryNumber */'1'
