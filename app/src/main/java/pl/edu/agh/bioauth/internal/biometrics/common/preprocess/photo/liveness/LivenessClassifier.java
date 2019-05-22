package pl.edu.agh.bioauth.internal.biometrics.common.preprocess.photo.liveness;

class LivenessClassifier {
    public static int predict_0(double[] features) {
        int[] classes = new int[2];

        if (features[185] <= 114.88403801466677) {
            if (features[232] <= 22.94168810406393) {
                if (features[380] <= 76.01893063848837) {
                    if (features[1011] <= 14.526536593648713) {
                        if (features[1391] <= 30.716133953869036) {
                            if (features[876] <= 58.04143358872189) {
                                if (features[934] <= 56.251141596520895) {
                                    classes[0] = 10933;
                                    classes[1] = 0;
                                } else {
                                    if (features[376] <= 63.66743840725298) {
                                        if (features[1415] <= 120.71558949074587) {
                                            classes[0] = 10047;
                                            classes[1] = 0;
                                        } else {
                                            if (features[415] <= 16.049989080202664) {
                                                classes[0] = 70;
                                                classes[1] = 0;
                                            } else {
                                                if (features[686] <= 2.888395844053758) {
                                                    classes[0] = 5;
                                                    classes[1] = 1;
                                                } else {
                                                    classes[0] = 14;
                                                    classes[1] = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[666] <= 8.959676287530563) {
                                            classes[0] = 6;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 7;
                                            classes[1] = 0;
                                        }
                                    }
                                }
                            } else {
                                if (features[107] <= 92.19047103724168) {
                                    classes[0] = 5;
                                    classes[1] = 1;
                                } else {
                                    classes[0] = 10;
                                    classes[1] = 0;
                                }
                            }
                        } else {
                            if (features[861] <= 51.74825467203157) {
                                if (features[917] <= 161.84109406880856) {
                                    classes[0] = 5;
                                    classes[1] = 1;
                                } else {
                                    classes[0] = 9;
                                    classes[1] = 0;
                                }
                            } else {
                                classes[0] = 122;
                                classes[1] = 0;
                            }
                        }
                    } else {
                        if (features[895] <= 12.26631083169697) {
                            classes[0] = 0;
                            classes[1] = 211;
                        } else {
                            if (features[153] <= 19.936500143086477) {
                                classes[0] = 0;
                                classes[1] = 29;
                            } else {
                                classes[0] = 1216;
                                classes[1] = 0;
                            }
                        }
                    }
                } else {
                    if (features[417] <= 18.42485382297889) {
                        if (features[1003] <= 0.553647080432516) {
                            classes[0] = 0;
                            classes[1] = 470;
                        } else {
                            if (features[1406] <= 105.642593493372) {
                                if (features[968] <= 51.43446522786435) {
                                    if (features[969] <= 39.478634797476666) {
                                        classes[0] = 4153;
                                        classes[1] = 0;
                                    } else {
                                        if (features[409] <= 9.877084064637138) {
                                            classes[0] = 12;
                                            classes[1] = 0;
                                        } else {
                                            if (features[1105] <= 0.12705878301990853) {
                                                classes[0] = 6;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 6;
                                                classes[1] = 1;
                                            }
                                        }
                                    }
                                } else {
                                    if (features[63] <= 23.988297902595356) {
                                        classes[0] = 3;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 6;
                                        classes[1] = 0;
                                    }
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 9;
                            }
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 667;
                    }
                }
            } else {
                if (features[88] <= 21.46331861110989) {
                    if (features[1442] <= 2.119506623891903) {
                        classes[0] = 0;
                        classes[1] = 7;
                    } else {
                        classes[0] = 710;
                        classes[1] = 0;
                    }
                } else {
                    if (features[1148] <= 74.59167012314623) {
                        classes[0] = 0;
                        classes[1] = 2051;
                    } else {
                        classes[0] = 205;
                        classes[1] = 0;
                    }
                }
            }
        } else {
            if (features[1117] <= 17.253352976098146) {
                if (features[643] <= 153.17570209575473) {
                    if (features[1116] <= 5.498592686704326) {
                        if (features[384] <= 99.4049061733231) {
                            classes[0] = 2424;
                            classes[1] = 0;
                        } else {
                            classes[0] = 0;
                            classes[1] = 12;
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 14;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 8;
                }
            } else {
                classes[0] = 0;
                classes[1] = 3141;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_1(double[] features) {
        int[] classes = new int[2];

        if (features[982] <= 36.04577819025082) {
            if (features[1016] <= 39.34009123983685) {
                if (features[1440] <= 24.17801002014115) {
                    if (features[1150] <= 21.92778782175431) {
                        if (features[380] <= 117.86185475898061) {
                            if (features[1404] <= 43.25262809980957) {
                                if (features[1420] <= 38.354837357544504) {
                                    if (features[1450] <= 0.9228270572473615) {
                                        if (features[228] <= 2.5905182135740135) {
                                            if (features[141] <= 20.92407847710634) {
                                                classes[0] = 37;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 4;
                                                classes[1] = 2;
                                            }
                                        } else {
                                            classes[0] = 124;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        if (features[217] <= 2.025801577627299) {
                                            classes[0] = 5034;
                                            classes[1] = 0;
                                        } else {
                                            if (features[775] <= 16.795398196557414) {
                                                classes[0] = 673;
                                                classes[1] = 0;
                                            } else {
                                                if (features[419] <= 9.39759962383091) {
                                                    classes[0] = 25;
                                                    classes[1] = 0;
                                                } else {
                                                    classes[0] = 4;
                                                    classes[1] = 2;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[974] <= 62.80132498831796) {
                                        classes[0] = 20509;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 10;
                                        classes[1] = 1;
                                    }
                                }
                            } else {
                                if (features[1007] <= 2.8632806961860804) {
                                    if (features[1160] <= 0.5908881029719621) {
                                        if (features[98] <= 20.127263711252315) {
                                            classes[0] = 0;
                                            classes[1] = 7;
                                        } else {
                                            classes[0] = 3;
                                            classes[1] = 2;
                                        }
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 26;
                                    }
                                } else {
                                    classes[0] = 561;
                                    classes[1] = 0;
                                }
                            }
                        } else {
                            if (features[249] <= 0.5856587926517473) {
                                classes[0] = 0;
                                classes[1] = 222;
                            } else {
                                classes[0] = 366;
                                classes[1] = 0;
                            }
                        }
                    } else {
                        if (features[177] <= 81.70110431431549) {
                            if (features[1454] <= 16.1759521290634) {
                                classes[0] = 124;
                                classes[1] = 0;
                            } else {
                                classes[0] = 0;
                                classes[1] = 231;
                            }
                        } else {
                            if (features[345] <= 0.4191374762639952) {
                                if (features[940] <= 119.26345112712431) {
                                    classes[0] = 603;
                                    classes[1] = 0;
                                } else {
                                    if (features[41] <= 22.203380312386788) {
                                        if (features[72] <= 14.78357235982774) {
                                            classes[0] = 6;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 1;
                                            classes[1] = 4;
                                        }
                                    } else {
                                        classes[0] = 16;
                                        classes[1] = 0;
                                    }
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 8;
                            }
                        }
                    }
                } else {
                    if (features[29] <= 26.3181208484032) {
                        if (features[1140] <= 5.872217523248398) {
                            if (features[895] <= 18.379702625752984) {
                                classes[0] = 17;
                                classes[1] = 0;
                            } else {
                                if (features[935] <= 251.74111544869817) {
                                    classes[0] = 5;
                                    classes[1] = 2;
                                } else {
                                    classes[0] = 10;
                                    classes[1] = 0;
                                }
                            }
                        } else {
                            if (features[426] <= 2.6661945986638713) {
                                classes[0] = 0;
                                classes[1] = 770;
                            } else {
                                if (features[1384] <= 1.8085749764702792) {
                                    classes[0] = 3;
                                    classes[1] = 4;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 12;
                                }
                            }
                        }
                    } else {
                        classes[0] = 230;
                        classes[1] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 240;
            }
        } else {
            if (features[912] <= 55.4234345450165) {
                if (features[247] <= 0.35993291882734413) {
                    if (features[1147] <= 11.268856246789218) {
                        classes[0] = 6;
                        classes[1] = 2;
                    } else {
                        classes[0] = 0;
                        classes[1] = 790;
                    }
                } else {
                    if (features[1127] <= 44.42022021454093) {
                        if (features[137] <= 31.227684529622945) {
                            if (features[251] <= 0.4363472376944092) {
                                classes[0] = 0;
                                classes[1] = 16;
                            } else {
                                classes[0] = 426;
                                classes[1] = 0;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 777;
                        }
                    } else {
                        classes[0] = 1174;
                        classes[1] = 0;
                    }
                }
            } else {
                if (features[43] <= 12.227912094405074) {
                    if (features[650] <= 44.85446202469062) {
                        if (features[1116] <= 14.940435090568103) {
                            classes[0] = 3;
                            classes[1] = 3;
                        } else {
                            classes[0] = 0;
                            classes[1] = 19;
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 27;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 3459;
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_2(double[] features) {
        int[] classes = new int[2];

        if (features[1402] <= 93.22654131009205) {
            if (features[1105] <= 5.70004965966638) {
                if (features[214] <= 33.888559694679124) {
                    if (features[380] <= 127.1476703775803) {
                        if (features[197] <= 28.0315473536682) {
                            if (features[1018] <= 38.039142239439435) {
                                if (features[152] <= 205.70423013820889) {
                                    if (features[970] <= 15.291386826262384) {
                                        classes[0] = 17304;
                                        classes[1] = 0;
                                    } else {
                                        if (features[1115] <= 93.7045157405111) {
                                            classes[0] = 3388;
                                            classes[1] = 0;
                                        } else {
                                            if (features[204] <= 13.53900378954166) {
                                                classes[0] = 294;
                                                classes[1] = 0;
                                            } else {
                                                if (features[612] <= 0.03405405193465431) {
                                                    classes[0] = 176;
                                                    classes[1] = 0;
                                                } else {
                                                    classes[0] = 8;
                                                    classes[1] = 1;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[409] <= 18.44437687117045) {
                                        classes[0] = 22;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 12;
                                    }
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 7;
                            }
                        } else {
                            if (features[956] <= 239.4699491358304) {
                                if (features[974] <= 71.7050236909293) {
                                    if (features[1410] <= 58.20236857070999) {
                                        if (features[97] <= 45.634791951472316) {
                                            if (features[929] <= 210.42581857102553) {
                                                if (features[76] <= 29.213325719162246) {
                                                    if (features[381] <= 32.80905650481568) {
                                                        classes[0] = 5653;
                                                        classes[1] = 0;
                                                    } else {
                                                        if (features[42] <= 15.267985613443273) {
                                                            if (features[871] <= 23.273793446494665) {
                                                                classes[0] = 4;
                                                                classes[1] = 1;
                                                            } else {
                                                                classes[0] = 5;
                                                                classes[1] = 0;
                                                            }
                                                        } else {
                                                            if (features[408] <= 17.733122824552588) {
                                                                classes[0] = 801;
                                                                classes[1] = 0;
                                                            } else {
                                                                if (features[1404] <= 32.11028564781169) {
                                                                    classes[0] = 56;
                                                                    classes[1] = 0;
                                                                } else {
                                                                    if (features[27] <= 41.63800394742843) {
                                                                        classes[0] = 5;
                                                                        classes[1] = 2;
                                                                    } else {
                                                                        classes[0] = 30;
                                                                        classes[1] = 0;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (features[413] <= 20.455983509449503) {
                                                        classes[0] = 19;
                                                        classes[1] = 0;
                                                    } else {
                                                        classes[0] = 3;
                                                        classes[1] = 2;
                                                    }
                                                }
                                            } else {
                                                classes[0] = 6;
                                                classes[1] = 1;
                                            }
                                        } else {
                                            if (features[383] <= 218.71895356081967) {
                                                if (features[647] <= 25.25311892423053) {
                                                    classes[0] = 12;
                                                    classes[1] = 0;
                                                } else {
                                                    if (features[911] <= 32.61037789543189) {
                                                        classes[0] = 4;
                                                        classes[1] = 1;
                                                    } else {
                                                        classes[0] = 6;
                                                        classes[1] = 1;
                                                    }
                                                }
                                            } else {
                                                classes[0] = 0;
                                                classes[1] = 89;
                                            }
                                        }
                                    } else {
                                        if (features[1438] <= 7.544887894569267) {
                                            classes[0] = 5;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 0;
                                            classes[1] = 52;
                                        }
                                    }
                                } else {
                                    if (features[1430] <= 13.033659263806367) {
                                        classes[0] = 0;
                                        classes[1] = 261;
                                    } else {
                                        if (features[402] <= 13.795212231637576) {
                                            classes[0] = 0;
                                            classes[1] = 27;
                                        } else {
                                            classes[0] = 2;
                                            classes[1] = 3;
                                        }
                                    }
                                }
                            } else {
                                if (features[1131] <= 10.844439489834334) {
                                    classes[0] = 0;
                                    classes[1] = 68;
                                } else {
                                    classes[0] = 14;
                                    classes[1] = 0;
                                }
                            }
                        }
                    } else {
                        if (features[249] <= 6.04242137919043) {
                            classes[0] = 0;
                            classes[1] = 524;
                        } else {
                            classes[0] = 212;
                            classes[1] = 0;
                        }
                    }
                } else {
                    if (features[1469] <= 10.724813642048048) {
                        if (features[906] <= 35.32067322476099) {
                            if (features[1148] <= 7.793409880012934) {
                                classes[0] = 424;
                                classes[1] = 0;
                            } else {
                                classes[0] = 0;
                                classes[1] = 271;
                            }
                        } else {
                            if (features[631] <= 163.92672290470009) {
                                classes[0] = 0;
                                classes[1] = 2185;
                            } else {
                                classes[0] = 22;
                                classes[1] = 0;
                            }
                        }
                    } else {
                        classes[0] = 749;
                        classes[1] = 0;
                    }
                }
            } else {
                if (features[1194] <= 2.591416038654803) {
                    classes[0] = 0;
                    classes[1] = 1103;
                } else {
                    classes[0] = 750;
                    classes[1] = 0;
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 2015;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_3(double[] features) {
        int[] classes = new int[2];

        if (features[987] <= 107.85854315752722) {
            if (features[416] <= 21.74230153573482) {
                if (features[984] <= 20.957948474584356) {
                    if (features[937] <= 177.40149674980924) {
                        if (features[227] <= 14.504578415775882) {
                            if (features[218] <= 13.708458126908099) {
                                if (features[1395] <= 83.01985695075639) {
                                    if (features[1001] <= 11.747065493432562) {
                                        if (features[960] <= 70.68567301001688) {
                                            classes[0] = 21148;
                                            classes[1] = 0;
                                        } else {
                                            if (features[610] <= 23.66132495528846) {
                                                classes[0] = 1532;
                                                classes[1] = 0;
                                            } else {
                                                if (features[387] <= 24.74737424630107) {
                                                    classes[0] = 4;
                                                    classes[1] = 1;
                                                } else {
                                                    classes[0] = 0;
                                                    classes[1] = 6;
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[892] <= 21.054609639444468) {
                                            if (features[39] <= 3.884616523990324) {
                                                classes[0] = 6;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 3;
                                                classes[1] = 2;
                                            }
                                        } else {
                                            classes[0] = 95;
                                            classes[1] = 0;
                                        }
                                    }
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 64;
                                }
                            } else {
                                if (features[1419] <= 89.58608932237327) {
                                    classes[0] = 0;
                                    classes[1] = 14;
                                } else {
                                    classes[0] = 99;
                                    classes[1] = 0;
                                }
                            }
                        } else {
                            if (features[146] <= 38.535268582788134) {
                                classes[0] = 0;
                                classes[1] = 234;
                            } else {
                                classes[0] = 611;
                                classes[1] = 0;
                            }
                        }
                    } else {
                        if (features[1392] <= 69.82872198714918) {
                            if (features[194] <= 39.655077417914775) {
                                if (features[1117] <= 97.76132120531146) {
                                    classes[0] = 909;
                                    classes[1] = 0;
                                } else {
                                    if (features[49] <= 26.490779154415485) {
                                        classes[0] = 3;
                                        classes[1] = 6;
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 75;
                                    }
                                }
                            } else {
                                if (features[409] <= 10.072069172057018) {
                                    if (features[907] <= 33.44516692205922) {
                                        classes[0] = 5;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 60;
                                        classes[1] = 0;
                                    }
                                } else {
                                    if (features[78] <= 21.801301164225322) {
                                        classes[0] = 1;
                                        classes[1] = 8;
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 88;
                                    }
                                }
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 219;
                        }
                    }
                } else {
                    if (features[913] <= 58.703547612412024) {
                        if (features[1412] <= 183.58796576813216) {
                            if (features[372] <= 116.87734962249857) {
                                if (features[876] <= 23.229891877117616) {
                                    classes[0] = 2566;
                                    classes[1] = 0;
                                } else {
                                    if (features[870] <= 20.956326304115002) {
                                        classes[0] = 6;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 9;
                                    }
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 28;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 579;
                        }
                    } else {
                        if (features[210] <= 37.64398066989881) {
                            if (features[1112] <= 90.77874308398947) {
                                classes[0] = 12;
                                classes[1] = 0;
                            } else {
                                classes[0] = 0;
                                classes[1] = 5;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 629;
                        }
                    }
                }
            } else {
                if (features[396] <= 77.8073047828851) {
                    if (features[907] <= 16.746067256471875) {
                        classes[0] = 372;
                        classes[1] = 0;
                    } else {
                        if (features[1157] <= 70.75639576012385) {
                            classes[0] = 0;
                            classes[1] = 1826;
                        } else {
                            classes[0] = 12;
                            classes[1] = 0;
                        }
                    }
                } else {
                    classes[0] = 1996;
                    classes[1] = 0;
                }
            }
        } else {
            if (features[1142] <= 14.10176495534414) {
                classes[0] = 0;
                classes[1] = 2416;
            } else {
                if (features[1478] <= 0.24951873767739435) {
                    classes[0] = 0;
                    classes[1] = 416;
                } else {
                    classes[0] = 534;
                    classes[1] = 0;
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_4(double[] features) {
        int[] classes = new int[2];

        if (features[227] <= 49.23182774596747) {
            if (features[620] <= 12.736196335920894) {
                if (features[975] <= 43.0546700061753) {
                    if (features[231] <= 28.917835492562116) {
                        if (features[213] <= 39.09858485301488) {
                            if (features[1006] <= 10.199269764305464) {
                                if (features[1138] <= 17.89788684906204) {
                                    classes[0] = 21637;
                                    classes[1] = 0;
                                } else {
                                    if (features[34] <= 13.468811189571165) {
                                        if (features[181] <= 66.47611547095013) {
                                            classes[0] = 85;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 10;
                                            classes[1] = 1;
                                        }
                                    } else {
                                        classes[0] = 2462;
                                        classes[1] = 0;
                                    }
                                }
                            } else {
                                if (features[912] <= 27.297651151214232) {
                                    classes[0] = 0;
                                    classes[1] = 240;
                                } else {
                                    classes[0] = 490;
                                    classes[1] = 0;
                                }
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 185;
                        }
                    } else {
                        if (features[815] <= 15.512826337654642) {
                            classes[0] = 16;
                            classes[1] = 0;
                        } else {
                            classes[0] = 0;
                            classes[1] = 44;
                        }
                    }
                } else {
                    if (features[432] <= 0.43744872821884156) {
                        if (features[647] <= 6.59122576619759) {
                            classes[0] = 998;
                            classes[1] = 0;
                        } else {
                            if (features[412] <= 15.812077874562348) {
                                if (features[1400] <= 21.84105125028033) {
                                    classes[0] = 146;
                                    classes[1] = 0;
                                } else {
                                    if (features[882] <= 37.09968646751671) {
                                        classes[0] = 7;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 18;
                                    }
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 212;
                            }
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 416;
                    }
                }
            } else {
                if (features[1118] <= 88.21689837344951) {
                    if (features[193] <= 140.209884739113) {
                        if (features[159] <= 188.3012826122901) {
                            classes[0] = 2671;
                            classes[1] = 0;
                        } else {
                            classes[0] = 3;
                            classes[1] = 5;
                        }
                    } else {
                        if (features[233] <= 4.361583319457654) {
                            classes[0] = 0;
                            classes[1] = 172;
                        } else {
                            classes[0] = 1;
                            classes[1] = 4;
                        }
                    }
                } else {
                    if (features[911] <= 115.02056787049176) {
                        classes[0] = 0;
                        classes[1] = 1973;
                    } else {
                        classes[0] = 5;
                        classes[1] = 0;
                    }
                }
            }
        } else {
            if (features[883] <= 38.56832325497385) {
                if (features[1132] <= 62.459307782340716) {
                    classes[0] = 0;
                    classes[1] = 511;
                } else {
                    classes[0] = 1373;
                    classes[1] = 0;
                }
            } else {
                if (features[411] <= 49.95266104854771) {
                    classes[0] = 0;
                    classes[1] = 2845;
                } else {
                    classes[0] = 70;
                    classes[1] = 0;
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_5(double[] features) {
        int[] classes = new int[2];

        if (features[1405] <= 83.17491262172508) {
            if (features[1017] <= 38.99007057619821) {
                if (features[971] <= 78.4522455192457) {
                    if (features[1445] <= 36.307576170394036) {
                        if (features[1114] <= 142.06809724777384) {
                            if (features[955] <= 140.4917714759971) {
                                if (features[376] <= 70.40909357504934) {
                                    if (features[648] <= 85.70094428647421) {
                                        if (features[245] <= 25.580372046628437) {
                                            classes[0] = 25246;
                                            classes[1] = 0;
                                        } else {
                                            if (features[140] <= 59.54245293726908) {
                                                classes[0] = 77;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 0;
                                                classes[1] = 5;
                                            }
                                        }
                                    } else {
                                        if (features[113] <= 62.414812199476366) {
                                            classes[0] = 0;
                                            classes[1] = 41;
                                        } else {
                                            classes[0] = 135;
                                            classes[1] = 0;
                                        }
                                    }
                                } else {
                                    if (features[1139] <= 25.7385004000355) {
                                        classes[0] = 675;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 242;
                                    }
                                }
                            } else {
                                if (features[384] <= 30.121623902027086) {
                                    classes[0] = 3024;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 540;
                                }
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 176;
                        }
                    } else {
                        if (features[601] <= 21.785509130372084) {
                            classes[0] = 0;
                            classes[1] = 631;
                        } else {
                            classes[0] = 9;
                            classes[1] = 0;
                        }
                    }
                } else {
                    if (features[393] <= 79.78718938207315) {
                        if (features[1439] <= 7.258877055801469) {
                            if (features[395] <= 118.9138870161) {
                                classes[0] = 0;
                                classes[1] = 541;
                            } else {
                                classes[0] = 8;
                                classes[1] = 0;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 1251;
                        }
                    } else {
                        classes[0] = 799;
                        classes[1] = 0;
                    }
                }
            } else {
                if (features[812] <= 25.408966738445955) {
                    if (features[370] <= 11.071558623366661) {
                        if (features[226] <= 60.536727150516754) {
                            classes[0] = 0;
                            classes[1] = 65;
                        } else {
                            classes[0] = 1;
                            classes[1] = 5;
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 268;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 353;
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 2508;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_6(double[] features) {
        int[] classes = new int[2];

        if (features[114] <= 60.374033094010684) {
            if (features[962] <= 37.32229673224982) {
                if (features[215] <= 68.84384962697264) {
                    if (features[1447] <= 26.40424788032007) {
                        if (features[1014] <= 14.427859580855316) {
                            if (features[157] <= 227.87909552733555) {
                                classes[0] = 19049;
                                classes[1] = 0;
                            } else {
                                if (features[208] <= 1.7022851441309232) {
                                    classes[0] = 142;
                                    classes[1] = 0;
                                } else {
                                    if (features[1445] <= 12.82714760986023) {
                                        classes[0] = 2;
                                        classes[1] = 3;
                                    } else {
                                        classes[0] = 11;
                                        classes[1] = 0;
                                    }
                                }
                            }
                        } else {
                            if (features[893] <= 33.699537362828984) {
                                if (features[370] <= 5.89467921871592) {
                                    classes[0] = 52;
                                    classes[1] = 0;
                                } else {
                                    if (features[110] <= 36.93985181997327) {
                                        classes[0] = 0;
                                        classes[1] = 258;
                                    } else {
                                        classes[0] = 6;
                                        classes[1] = 0;
                                    }
                                }
                            } else {
                                classes[0] = 57;
                                classes[1] = 0;
                            }
                        }
                    } else {
                        if (features[432] <= 12.503515986493142) {
                            classes[0] = 0;
                            classes[1] = 28;
                        } else {
                            classes[0] = 17;
                            classes[1] = 0;
                        }
                    }
                } else {
                    if (features[34] <= 30.305405027098256) {
                        classes[0] = 2;
                        classes[1] = 4;
                    } else {
                        classes[0] = 0;
                        classes[1] = 11;
                    }
                }
            } else {
                if (features[851] <= 26.289363124213562) {
                    if (features[130] <= 43.52996746351363) {
                        if (features[375] <= 53.312128477270804) {
                            if (features[1130] <= 219.92221392940556) {
                                if (features[380] <= 12.775541408666207) {
                                    if (features[207] <= 65.88554075745348) {
                                        classes[0] = 2271;
                                        classes[1] = 0;
                                    } else {
                                        if (features[180] <= 102.49453034608135) {
                                            classes[0] = 6;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 389;
                                            classes[1] = 0;
                                        }
                                    }
                                } else {
                                    if (features[1143] <= 49.181885742411175) {
                                        if (features[73] <= 42.93946708463446) {
                                            if (features[936] <= 21.885108350257276) {
                                                classes[0] = 5;
                                                classes[1] = 0;
                                            } else {
                                                if (features[635] <= 54.340161742157264) {
                                                    classes[0] = 0;
                                                    classes[1] = 440;
                                                } else {
                                                    if (features[1128] <= 15.979291554493765) {
                                                        if (features[790] <= 27.78713968000762) {
                                                            classes[0] = 1;
                                                            classes[1] = 7;
                                                        } else {
                                                            classes[0] = 0;
                                                            classes[1] = 15;
                                                        }
                                                    } else {
                                                        classes[0] = 0;
                                                        classes[1] = 45;
                                                    }
                                                }
                                            }
                                        } else {
                                            classes[0] = 40;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        classes[0] = 303;
                                        classes[1] = 0;
                                    }
                                }
                            } else {
                                classes[0] = 4330;
                                classes[1] = 0;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 233;
                        }
                    } else {
                        if (features[384] <= 109.85422837144561) {
                            if (features[64] <= 24.10962012452631) {
                                if (features[623] <= 17.875018943579885) {
                                    if (features[172] <= 89.96168027096179) {
                                        classes[0] = 2;
                                        classes[1] = 3;
                                    } else {
                                        if (features[382] <= 6.6017621554685855) {
                                            classes[0] = 1398;
                                            classes[1] = 0;
                                        } else {
                                            if (features[3] <= 25.56036634841707) {
                                                classes[0] = 50;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 10;
                                                classes[1] = 1;
                                            }
                                        }
                                    }
                                } else {
                                    if (features[423] <= 0.22440246712403103) {
                                        classes[0] = 3;
                                        classes[1] = 6;
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 16;
                                    }
                                }
                            } else {
                                if (features[1165] <= 15.860549882342731) {
                                    if (features[869] <= 17.184112880357098) {
                                        if (features[875] <= 20.853240292790858) {
                                            classes[0] = 1;
                                            classes[1] = 12;
                                        } else {
                                            classes[0] = 0;
                                            classes[1] = 19;
                                        }
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 349;
                                    }
                                } else {
                                    classes[0] = 23;
                                    classes[1] = 0;
                                }
                            }
                        } else {
                            if (features[618] <= 3.2107949811279712) {
                                if (features[1437] <= 0.9664996317321181) {
                                    classes[0] = 90;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 8;
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 1140;
                            }
                        }
                    }
                } else {
                    if (features[211] <= 233.69476228669666) {
                        if (features[593] <= 5.070660415027229) {
                            if (features[631] <= 96.27998199492293) {
                                if (features[979] <= 43.54242369074728) {
                                    if (features[1118] <= 57.729037837583434) {
                                        classes[0] = 8;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 521;
                                    }
                                } else {
                                    if (features[823] <= 46.034770648516826) {
                                        if (features[965] <= 184.2539443361051) {
                                            classes[0] = 0;
                                            classes[1] = 1409;
                                        } else {
                                            if (features[43] <= 23.338457791375774) {
                                                classes[0] = 0;
                                                classes[1] = 45;
                                            } else {
                                                classes[0] = 1;
                                                classes[1] = 5;
                                            }
                                        }
                                    } else {
                                        if (features[114] <= 40.799892407224334) {
                                            classes[0] = 1;
                                            classes[1] = 6;
                                        } else {
                                            classes[0] = 0;
                                            classes[1] = 20;
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 102;
                                classes[1] = 0;
                            }
                        } else {
                            classes[0] = 32;
                            classes[1] = 0;
                        }
                    } else {
                        if (features[401] <= 68.9660569911068) {
                            classes[0] = 0;
                            classes[1] = 165;
                        } else {
                            classes[0] = 404;
                            classes[1] = 0;
                        }
                    }
                }
            }
        } else {
            if (features[968] <= 68.25659495050198) {
                if (features[207] <= 39.56486522078517) {
                    if (features[152] <= 151.2127737667114) {
                        classes[0] = 1144;
                        classes[1] = 0;
                    } else {
                        if (features[16] <= 21.328933932065908) {
                            classes[0] = 6;
                            classes[1] = 2;
                        } else {
                            classes[0] = 14;
                            classes[1] = 0;
                        }
                    }
                } else {
                    if (features[429] <= 0.572542093391571) {
                        classes[0] = 0;
                        classes[1] = 57;
                    } else {
                        if (features[1135] <= 6.816121066383173) {
                            classes[0] = 0;
                            classes[1] = 33;
                        } else {
                            classes[0] = 1;
                            classes[1] = 4;
                        }
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 1760;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_7(double[] features) {
        int[] classes = new int[2];

        if (features[991] <= 33.08183164479296) {
            if (features[1394] <= 84.57922313620759) {
                if (features[174] <= 200.78362265359337) {
                    if (features[1415] <= 100.9540179040015) {
                        if (features[162] <= 110.16120430967295) {
                            if (features[909] <= 81.71587758939782) {
                                classes[0] = 18884;
                                classes[1] = 0;
                            } else {
                                if (features[952] <= 73.49018985953104) {
                                    classes[0] = 1587;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 1;
                                }
                            }
                        } else {
                            if (features[385] <= 44.64911827598919) {
                                if (features[405] <= 12.503008302339863) {
                                    if (features[190] <= 171.20645283203945) {
                                        classes[0] = 5002;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 14;
                                    }
                                } else {
                                    if (features[612] <= 9.275495232237974) {
                                        if (features[211] <= 13.889606815297348) {
                                            classes[0] = 0;
                                            classes[1] = 39;
                                        } else {
                                            classes[0] = 3;
                                            classes[1] = 4;
                                        }
                                    } else {
                                        classes[0] = 71;
                                        classes[1] = 0;
                                    }
                                }
                            } else {
                                if (features[1023] <= 227.23347852573696) {
                                    if (features[633] <= 59.92138893166056) {
                                        if (features[60] <= 14.683600560610618) {
                                            classes[0] = 3;
                                            classes[1] = 3;
                                        } else {
                                            classes[0] = 0;
                                            classes[1] = 118;
                                        }
                                    } else {
                                        classes[0] = 17;
                                        classes[1] = 0;
                                    }
                                } else {
                                    classes[0] = 317;
                                    classes[1] = 0;
                                }
                            }
                        }
                    } else {
                        if (features[1445] <= 25.048749611633845) {
                            if (features[634] <= 37.05600315552604) {
                                if (features[1428] <= 10.300951408502529) {
                                    classes[0] = 0;
                                    classes[1] = 241;
                                } else {
                                    if (features[671] <= 0.1940047381310833) {
                                        if (features[672] <= 0.04595240521533618) {
                                            classes[0] = 4;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 0;
                                            classes[1] = 49;
                                        }
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 190;
                                    }
                                }
                            } else {
                                if (features[1415] <= 121.58394457901026) {
                                    classes[0] = 626;
                                    classes[1] = 0;
                                } else {
                                    if (features[405] <= 11.793442516310106) {
                                        classes[0] = 82;
                                        classes[1] = 0;
                                    } else {
                                        if (features[670] <= 0.015127266131080076) {
                                            classes[0] = 6;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 6;
                                            classes[1] = 0;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[1170] <= 0.15124016100496498) {
                                classes[0] = 0;
                                classes[1] = 463;
                            } else {
                                if (features[1003] <= 0.09849321616111811) {
                                    classes[0] = 0;
                                    classes[1] = 75;
                                } else {
                                    if (features[605] <= 6.702115325586836) {
                                        classes[0] = 0;
                                        classes[1] = 8;
                                    } else {
                                        classes[0] = 2;
                                        classes[1] = 7;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (features[644] <= 79.80350890649028) {
                        if (features[71] <= 26.45132679665503) {
                            if (features[609] <= 24.15567541077127) {
                                classes[0] = 2834;
                                classes[1] = 0;
                            } else {
                                classes[0] = 0;
                                classes[1] = 97;
                            }
                        } else {
                            if (features[72] <= 27.652064452331633) {
                                classes[0] = 2;
                                classes[1] = 3;
                            } else {
                                classes[0] = 0;
                                classes[1] = 24;
                            }
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 628;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 414;
            }
        } else {
            if (features[121] <= 43.323607853971254) {
                if (features[649] <= 49.972682527200945) {
                    if (features[906] <= 21.47615842283618) {
                        classes[0] = 339;
                        classes[1] = 0;
                    } else {
                        if (features[434] <= 1.6660403427441013) {
                            if (features[384] <= 26.131778932266894) {
                                classes[0] = 15;
                                classes[1] = 0;
                            } else {
                                classes[0] = 0;
                                classes[1] = 309;
                            }
                        } else {
                            classes[0] = 133;
                            classes[1] = 0;
                        }
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 541;
                }
            } else {
                if (features[1132] <= 95.7021712018156) {
                    if (features[434] <= 3.2155886196388175) {
                        classes[0] = 0;
                        classes[1] = 3396;
                    } else {
                        classes[0] = 11;
                        classes[1] = 0;
                    }
                } else {
                    classes[0] = 26;
                    classes[1] = 0;
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_8(double[] features) {
        int[] classes = new int[2];

        if (features[1123] <= 115.15357751753794) {
            if (features[86] <= 31.949003549861477) {
                if (features[846] <= 25.90259613959932) {
                    if (features[643] <= 83.91129464454788) {
                        if (features[1402] <= 46.12869241384455) {
                            if (features[5] <= 68.0633516276857) {
                                if (features[647] <= 51.68884531230985) {
                                    if (features[381] <= 130.15245236230663) {
                                        if (features[977] <= 78.79506611417183) {
                                            if (features[978] <= 35.61722799259113) {
                                                classes[0] = 16322;
                                                classes[1] = 0;
                                            } else {
                                                if (features[25] <= 10.218458439177223) {
                                                    if (features[4] <= 63.020354155558884) {
                                                        if (features[801] <= 5.775000320049796) {
                                                            classes[0] = 4;
                                                            classes[1] = 1;
                                                        } else {
                                                            classes[0] = 10;
                                                            classes[1] = 0;
                                                        }
                                                    } else {
                                                        classes[0] = 201;
                                                        classes[1] = 0;
                                                    }
                                                } else {
                                                    classes[0] = 238;
                                                    classes[1] = 0;
                                                }
                                            }
                                        } else {
                                            if (features[800] <= 17.672042771896976) {
                                                classes[0] = 2;
                                                classes[1] = 3;
                                            } else {
                                                classes[0] = 183;
                                                classes[1] = 0;
                                            }
                                        }
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 17;
                                    }
                                } else {
                                    if (features[1012] <= 15.564931699219185) {
                                        classes[0] = 1174;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 158;
                                    }
                                }
                            } else {
                                if (features[600] <= 3.5556946113983883) {
                                    classes[0] = 98;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 232;
                                }
                            }
                        } else {
                            if (features[149] <= 79.42803060133579) {
                                classes[0] = 0;
                                classes[1] = 229;
                            } else {
                                if (features[1396] <= 180.2063692026554) {
                                    classes[0] = 1;
                                    classes[1] = 8;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 7;
                                }
                            }
                        }
                    } else {
                        if (features[181] <= 196.78767096310068) {
                            if (features[383] <= 175.07567125841774) {
                                if (features[394] <= 16.15754125357512) {
                                    classes[0] = 0;
                                    classes[1] = 92;
                                } else {
                                    if (features[1009] <= 30.4361115683778) {
                                        classes[0] = 1158;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 12;
                                    }
                                }
                            } else {
                                if (features[783] <= 16.81412535675864) {
                                    classes[0] = 0;
                                    classes[1] = 181;
                                } else {
                                    classes[0] = 3;
                                    classes[1] = 4;
                                }
                            }
                        } else {
                            if (features[643] <= 122.83591293625369) {
                                if (features[1394] <= 0.05215122605039936) {
                                    classes[0] = 3;
                                    classes[1] = 2;
                                } else {
                                    classes[0] = 20;
                                    classes[1] = 0;
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 555;
                            }
                        }
                    }
                } else {
                    if (features[153] <= 58.871689151736255) {
                        if (features[124] <= 21.395324985170795) {
                            classes[0] = 195;
                            classes[1] = 0;
                        } else {
                            if (features[1127] <= 24.103346643228427) {
                                classes[0] = 0;
                                classes[1] = 241;
                            } else {
                                classes[0] = 68;
                                classes[1] = 0;
                            }
                        }
                    } else {
                        if (features[164] <= 73.22413364509185) {
                            classes[0] = 18;
                            classes[1] = 0;
                        } else {
                            if (features[600] <= 3.6870177839739737) {
                                classes[0] = 0;
                                classes[1] = 684;
                            } else {
                                classes[0] = 18;
                                classes[1] = 0;
                            }
                        }
                    }
                }
            } else {
                if (features[957] <= 73.37553297275436) {
                    if (features[985] <= 91.30601103958608) {
                        if (features[28] <= 20.034373326427296) {
                            if (features[602] <= 2.8480396811270916) {
                                if (features[943] <= 137.6541446229418) {
                                    classes[0] = 0;
                                    classes[1] = 188;
                                } else {
                                    if (features[981] <= 20.18564726237317) {
                                        classes[0] = 4;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 9;
                                    }
                                }
                            } else {
                                classes[0] = 5;
                                classes[1] = 0;
                            }
                        } else {
                            if (features[977] <= 19.586327093280605) {
                                if (features[152] <= 206.30121657053232) {
                                    classes[0] = 1860;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 2;
                                }
                            } else {
                                classes[0] = 4;
                                classes[1] = 1;
                            }
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 546;
                    }
                } else {
                    if (features[600] <= 0.5867399704563016) {
                        if (features[387] <= 12.581730435209158) {
                            classes[0] = 1;
                            classes[1] = 6;
                        } else {
                            classes[0] = 0;
                            classes[1] = 3352;
                        }
                    } else {
                        if (features[639] <= 124.01854870868806) {
                            if (features[374] <= 0.25731514851511883) {
                                classes[0] = 56;
                                classes[1] = 0;
                            } else {
                                classes[0] = 0;
                                classes[1] = 7;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 87;
                        }
                    }
                }
            }
        } else {
            classes[0] = 8324;
            classes[1] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_9(double[] features) {
        int[] classes = new int[2];

        if (features[973] <= 72.25832203042616) {
            if (features[407] <= 21.93745560162568) {
                if (features[1148] <= 17.92093268945709) {
                    if (features[988] <= 100.01330145316786) {
                        if (features[1414] <= 86.02829016646577) {
                            if (features[1442] <= 24.396058132007994) {
                                if (features[1401] <= 241.98451196191223) {
                                    if (features[650] <= 236.19638040796505) {
                                        if (features[211] <= 36.51429462479214) {
                                            if (features[158] <= 26.175344216594567) {
                                                if (features[1000] <= 9.257181121709841) {
                                                    classes[0] = 6424;
                                                    classes[1] = 0;
                                                } else {
                                                    if (features[800] <= 9.54852988192407) {
                                                        classes[0] = 0;
                                                        classes[1] = 47;
                                                    } else {
                                                        classes[0] = 30;
                                                        classes[1] = 0;
                                                    }
                                                }
                                            } else {
                                                if (features[201] <= 50.29109325529573) {
                                                    classes[0] = 19356;
                                                    classes[1] = 0;
                                                } else {
                                                    if (features[982] <= 28.503835031257957) {
                                                        classes[0] = 507;
                                                        classes[1] = 0;
                                                    } else {
                                                        if (features[190] <= 86.84657089047742) {
                                                            if (features[845] <= 14.660492740709472) {
                                                                classes[0] = 44;
                                                                classes[1] = 0;
                                                            } else {
                                                                classes[0] = 4;
                                                                classes[1] = 1;
                                                            }
                                                        } else {
                                                            classes[0] = 3;
                                                            classes[1] = 2;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[107] <= 20.930001796398454) {
                                                classes[0] = 19;
                                                classes[1] = 0;
                                            } else {
                                                if (features[905] <= 48.52180130905954) {
                                                    if (features[1410] <= 80.60203838242995) {
                                                        classes[0] = 2;
                                                        classes[1] = 6;
                                                    } else {
                                                        classes[0] = 0;
                                                        classes[1] = 10;
                                                    }
                                                } else {
                                                    classes[0] = 0;
                                                    classes[1] = 135;
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 26;
                                    }
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 26;
                                }
                            } else {
                                if (features[982] <= 40.97171274814001) {
                                    if (features[989] <= 5.900221474592413) {
                                        classes[0] = 282;
                                        classes[1] = 0;
                                    } else {
                                        if (features[795] <= 10.313947980179993) {
                                            classes[0] = 0;
                                            classes[1] = 27;
                                        } else {
                                            classes[0] = 1;
                                            classes[1] = 4;
                                        }
                                    }
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 177;
                                }
                            }
                        } else {
                            if (features[642] <= 82.31215373875317) {
                                if (features[169] <= 141.80026255403322) {
                                    classes[0] = 274;
                                    classes[1] = 0;
                                } else {
                                    if (features[636] <= 220.21070001900551) {
                                        classes[0] = 6;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 250;
                                        classes[1] = 0;
                                    }
                                }
                            } else {
                                if (features[365] <= 5.573019941241351) {
                                    if (features[1379] <= 4.794170288265548) {
                                        if (features[909] <= 70.82952771051356) {
                                            classes[0] = 0;
                                            classes[1] = 471;
                                        } else {
                                            if (features[31] <= 40.121553108196856) {
                                                classes[0] = 4;
                                                classes[1] = 1;
                                            } else {
                                                classes[0] = 16;
                                                classes[1] = 0;
                                            }
                                        }
                                    } else {
                                        classes[0] = 38;
                                        classes[1] = 0;
                                    }
                                } else {
                                    if (features[14] <= 38.50965832514408) {
                                        if (features[84] <= 21.923519470808493) {
                                            classes[0] = 0;
                                            classes[1] = 20;
                                        } else {
                                            classes[0] = 1;
                                            classes[1] = 8;
                                        }
                                    } else {
                                        if (features[37] <= 30.156092797032915) {
                                            classes[0] = 90;
                                            classes[1] = 0;
                                        } else {
                                            if (features[1137] <= 9.135647004198615) {
                                                classes[0] = 16;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 5;
                                                classes[1] = 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 206;
                    }
                } else {
                    if (features[640] <= 13.727852065481084) {
                        classes[0] = 29;
                        classes[1] = 0;
                    } else {
                        if (features[871] <= 21.78274995202661) {
                            if (features[917] <= 60.441588692850154) {
                                classes[0] = 2;
                                classes[1] = 4;
                            } else {
                                classes[0] = 0;
                                classes[1] = 14;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 726;
                        }
                    }
                }
            } else {
                if (features[389] <= 84.09844284045505) {
                    if (features[623] <= 11.449671969123356) {
                        if (features[942] <= 90.33346566950756) {
                            classes[0] = 94;
                            classes[1] = 0;
                        } else {
                            classes[0] = 0;
                            classes[1] = 14;
                        }
                    } else {
                        if (features[618] <= 6.884071689240688) {
                            if (features[41] <= 11.116574899699735) {
                                classes[0] = 0;
                                classes[1] = 169;
                            } else {
                                if (features[931] <= 78.31720947991616) {
                                    classes[0] = 30;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 2;
                                    classes[1] = 4;
                                }
                            }
                        } else {
                            if (features[394] <= 28.606795982132763) {
                                classes[0] = 0;
                                classes[1] = 1008;
                            } else {
                                if (features[178] <= 129.9476999091477) {
                                    if (features[1408] <= 155.79828867878996) {
                                        classes[0] = 1;
                                        classes[1] = 6;
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 42;
                                    }
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 35;
                                }
                            }
                        }
                    }
                } else {
                    classes[0] = 1288;
                    classes[1] = 0;
                }
            }
        } else {
            if (features[1180] <= 0.5339050787764754) {
                if (features[1118] <= 5.566412250446741) {
                    classes[0] = 408;
                    classes[1] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 3434;
                }
            } else {
                classes[0] = 748;
                classes[1] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict(double[] features) {
        int n_classes = 2;
        int[] classes = new int[n_classes];
        classes[LivenessClassifier.predict_0(features)]++;
        classes[LivenessClassifier.predict_1(features)]++;
        classes[LivenessClassifier.predict_2(features)]++;
        classes[LivenessClassifier.predict_3(features)]++;
        classes[LivenessClassifier.predict_4(features)]++;
        classes[LivenessClassifier.predict_5(features)]++;
        classes[LivenessClassifier.predict_6(features)]++;
        classes[LivenessClassifier.predict_7(features)]++;
        classes[LivenessClassifier.predict_8(features)]++;
        classes[LivenessClassifier.predict_9(features)]++;

        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < n_classes; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static void main(String[] args) {
        if (args.length == 1536) {

            // Features:
            double[] features = new double[args.length];
            for (int i = 0, l = args.length; i < l; i++) {
                features[i] = Double.parseDouble(args[i]);
            }

            // Prediction:
            int prediction = LivenessClassifier.predict(features);
            System.out.println(prediction);

        }
    }
}