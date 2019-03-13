#!/bin/bash

###########################################################################
# @author: itnoob
# @desc: modify config and start cachecloud
# @time: 2019-03-13
###########################################################################

sed -i "s@^cachecloud\.db\.url.*@cachecloud\.db\.url = $cachecloud_db_url@g" /opt/cachecloud-web/jdbc.properties
sed -i "s/^cachecloud\.db\.user.*/cachecloud\.db\.user = $cachecloud_db_user/g" /opt/cachecloud-web/jdbc.properties
sed -i "s/^cachecloud\.db\.password.*/cachecloud\.db\.password = $cachecloud_db_password/g" /opt/cachecloud-web/jdbc.properties
sh /opt/cachecloud-web/start.sh
tail -f