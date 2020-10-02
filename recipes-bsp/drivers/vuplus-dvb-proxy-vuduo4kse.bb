require vuplus-dvb-proxy.inc

SRCDATE = "20200903"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s ${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "31a2d038c2b07ea69162e883dbc054e7"
SRC_URI[sha256sum] = "9cb1ba3e5bc8d8ec1aad82872eb6ce7a8de8c241bf922c62997295820645e071"

COMPATIBLE_MACHINE = "^(vuduo4kse)$"
