#!/bin/bash
procc=$(systemctl is-active mysql)
if [[ $procc == "inactive" ]]; then
 systemctl start mysql
fi

