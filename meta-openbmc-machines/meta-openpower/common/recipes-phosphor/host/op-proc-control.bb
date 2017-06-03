SUMMARY = "OpenPower procedure control"
DESCRIPTION = "Provides procedures that run against the host chipset"
PR = "r1"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

DEPENDS += "autoconf-archive-native phosphor-logging"
RDEPENDS_${PN} += "phosphor-logging"

SRC_URI += "git://github.com/openbmc/openpower-proc-control"
SRCREV = "2548c7a35ab2ac8d8d73b8b8f5145d64f248ebe1"
