package pl.edu.agh.bioauth.internal.biometrics.common.preprocess.livenessmode;

class LivenessModeClassifier {
    public static int predict_0(double[] features) {
        int[] classes = new int[2];

        if (features[5] <= 0.5) {
            if (features[0] <= 3.5) {
                if (features[7] <= 1.5) {
                    classes[0] = 1;
                    classes[1] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 5;
                }
            } else {
                classes[0] = 0;
                classes[1] = 6;
            }
        } else {
            if (features[7] <= 0.5) {
                if (features[3] <= 7.0) {
                    if (features[2] <= 0.5) {
                        if (features[0] <= 5.5) {
                            if (features[4] <= 3.5) {
                                classes[0] = 1;
                                classes[1] = 0;
                            } else {
                                classes[0] = 0;
                                classes[1] = 4;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 4;
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 4;
                    }
                } else {
                    if (features[4] <= 4.5) {
                        if (features[2] <= 1.0) {
                            classes[0] = 1;
                            classes[1] = 0;
                        } else {
                            classes[0] = 0;
                            classes[1] = 2;
                        }
                    } else {
                        classes[0] = 9;
                        classes[1] = 0;
                    }
                }
            } else {
                classes[0] = 3;
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

    public static int predict_1(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 3.5) {
            if (features[7] <= 1.5) {
                if (features[4] <= 4.5) {
                    if (features[0] <= 3.5) {
                        classes[0] = 1;
                        classes[1] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 2;
                    }
                } else {
                    if (features[0] <= 3.5) {
                        classes[0] = 1;
                        classes[1] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 2;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 12;
            }
        } else {
            if (features[7] <= 0.5) {
                if (features[4] <= 3.5) {
                    classes[0] = 1;
                    classes[1] = 0;
                } else {
                    if (features[3] <= 7.0) {
                        if (features[0] <= 6.5) {
                            classes[0] = 0;
                            classes[1] = 6;
                        } else {
                            if (features[4] <= 4.5) {
                                if (features[2] <= 1.5) {
                                    classes[0] = 0;
                                    classes[1] = 3;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 0;
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 3;
                            }
                        }
                    } else {
                        if (features[4] <= 4.5) {
                            classes[0] = 0;
                            classes[1] = 1;
                        } else {
                            classes[0] = 2;
                            classes[1] = 0;
                        }
                    }
                }
            } else {
                if (features[0] <= 2.0) {
                    classes[0] = 0;
                    classes[1] = 1;
                } else {
                    classes[0] = 4;
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

    public static int predict_2(double[] features) {
        int[] classes = new int[2];

        if (features[5] <= 0.5) {
            if (features[0] <= 2.5) {
                classes[0] = 0;
                classes[1] = 7;
            } else {
                if (features[0] <= 3.5) {
                    classes[0] = 1;
                    classes[1] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 4;
                }
            }
        } else {
            if (features[4] <= 3.5) {
                classes[0] = 1;
                classes[1] = 0;
            } else {
                if (features[0] <= 6.5) {
                    if (features[3] <= 7.0) {
                        if (features[4] <= 4.5) {
                            classes[0] = 0;
                            classes[1] = 5;
                        } else {
                            if (features[2] <= 1.0) {
                                classes[0] = 0;
                                classes[1] = 2;
                            } else {
                                classes[0] = 1;
                                classes[1] = 0;
                            }
                        }
                    } else {
                        if (features[7] <= 0.5) {
                            if (features[4] <= 4.5) {
                                classes[0] = 0;
                                classes[1] = 1;
                            } else {
                                classes[0] = 3;
                                classes[1] = 0;
                            }
                        } else {
                            if (features[4] <= 4.5) {
                                classes[0] = 1;
                                classes[1] = 0;
                            } else {
                                if (features[0] <= 3.5) {
                                    classes[0] = 1;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 2;
                                }
                            }
                        }
                    }
                } else {
                    if (features[3] <= 7.0) {
                        if (features[4] <= 4.5) {
                            if (features[2] <= 1.0) {
                                classes[0] = 0;
                                classes[1] = 1;
                            } else {
                                classes[0] = 2;
                                classes[1] = 0;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 2;
                        }
                    } else {
                        classes[0] = 6;
                        classes[1] = 0;
                    }
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

    public static int predict_3(double[] features) {
        int[] classes = new int[2];

        if (features[0] <= 2.5) {
            if (features[2] <= 0.5) {
                classes[0] = 1;
                classes[1] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 8;
            }
        } else {
            if (features[3] <= 7.0) {
                if (features[4] <= 3.5) {
                    classes[0] = 1;
                    classes[1] = 0;
                } else {
                    if (features[2] <= 1.0) {
                        classes[0] = 0;
                        classes[1] = 6;
                    } else {
                        if (features[0] <= 6.5) {
                            if (features[4] <= 4.5) {
                                classes[0] = 0;
                                classes[1] = 2;
                            } else {
                                classes[0] = 1;
                                classes[1] = 0;
                            }
                        } else {
                            classes[0] = 2;
                            classes[1] = 0;
                        }
                    }
                }
            } else {
                if (features[1] <= 3.5) {
                    if (features[0] <= 3.5) {
                        classes[0] = 2;
                        classes[1] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 4;
                    }
                } else {
                    if (features[3] <= 15.0) {
                        if (features[7] <= 0.5) {
                            classes[0] = 6;
                            classes[1] = 0;
                        } else {
                            if (features[0] <= 3.5) {
                                classes[0] = 1;
                                classes[1] = 0;
                            } else {
                                if (features[4] <= 4.5) {
                                    classes[0] = 3;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 1;
                                }
                            }
                        }
                    } else {
                        if (features[2] <= 1.0) {
                            classes[0] = 1;
                            classes[1] = 0;
                        } else {
                            classes[0] = 0;
                            classes[1] = 1;
                        }
                    }
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

        if (features[4] <= 4.5) {
            if (features[1] <= 3.5) {
                classes[0] = 0;
                classes[1] = 11;
            } else {
                if (features[3] <= 7.0) {
                    classes[0] = 0;
                    classes[1] = 5;
                } else {
                    if (features[2] <= 1.0) {
                        classes[0] = 2;
                        classes[1] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 3;
                    }
                }
            }
        } else {
            if (features[2] <= 1.5) {
                if (features[0] <= 6.0) {
                    if (features[2] <= 0.5) {
                        if (features[5] <= 0.5) {
                            if (features[3] <= 7.0) {
                                classes[0] = 0;
                                classes[1] = 1;
                            } else {
                                classes[0] = 1;
                                classes[1] = 0;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 3;
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 5;
                    }
                } else {
                    if (features[2] <= 0.5) {
                        classes[0] = 1;
                        classes[1] = 0;
                    } else {
                        if (features[3] <= 15.0) {
                            if (features[3] <= 7.0) {
                                classes[0] = 0;
                                classes[1] = 1;
                            } else {
                                classes[0] = 1;
                                classes[1] = 0;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 3;
                        }
                    }
                }
            } else {
                classes[0] = 3;
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

    public static int predict_5(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 3.5) {
            if (features[7] <= 1.5) {
                if (features[4] <= 4.5) {
                    classes[0] = 0;
                    classes[1] = 3;
                } else {
                    if (features[3] <= 7.0) {
                        classes[0] = 0;
                        classes[1] = 2;
                    } else {
                        if (features[0] <= 3.0) {
                            classes[0] = 1;
                            classes[1] = 0;
                        } else {
                            classes[0] = 0;
                            classes[1] = 1;
                        }
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 5;
            }
        } else {
            if (features[3] <= 7.0) {
                if (features[2] <= 1.5) {
                    if (features[7] <= 0.5) {
                        if (features[0] <= 5.5) {
                            if (features[4] <= 4.0) {
                                classes[0] = 2;
                                classes[1] = 0;
                            } else {
                                classes[0] = 0;
                                classes[1] = 1;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 7;
                        }
                    } else {
                        if (features[0] <= 0.5) {
                            classes[0] = 2;
                            classes[1] = 0;
                        } else {
                            classes[0] = 0;
                            classes[1] = 1;
                        }
                    }
                } else {
                    if (features[0] <= 6.5) {
                        if (features[4] <= 4.5) {
                            classes[0] = 0;
                            classes[1] = 2;
                        } else {
                            classes[0] = 1;
                            classes[1] = 0;
                        }
                    } else {
                        classes[0] = 1;
                        classes[1] = 0;
                    }
                }
            } else {
                if (features[7] <= 0.5) {
                    classes[0] = 8;
                    classes[1] = 0;
                } else {
                    if (features[4] <= 4.5) {
                        classes[0] = 1;
                        classes[1] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 2;
                    }
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

    public static int predict_6(double[] features) {
        int[] classes = new int[2];

        if (features[5] <= 0.5) {
            if (features[0] <= 3.5) {
                if (features[7] <= 1.5) {
                    classes[0] = 3;
                    classes[1] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 5;
                }
            } else {
                classes[0] = 0;
                classes[1] = 7;
            }
        } else {
            if (features[2] <= 0.5) {
                if (features[3] <= 7.0) {
                    if (features[0] <= 0.5) {
                        classes[0] = 1;
                        classes[1] = 0;
                    } else {
                        if (features[0] <= 5.5) {
                            if (features[4] <= 4.0) {
                                classes[0] = 1;
                                classes[1] = 0;
                            } else {
                                classes[0] = 0;
                                classes[1] = 3;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 4;
                        }
                    }
                } else {
                    classes[0] = 6;
                    classes[1] = 0;
                }
            } else {
                if (features[3] <= 7.0) {
                    classes[0] = 0;
                    classes[1] = 6;
                } else {
                    if (features[3] <= 15.0) {
                        classes[0] = 3;
                        classes[1] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 1;
                    }
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

    public static int predict_7(double[] features) {
        int[] classes = new int[2];

        if (features[5] <= 0.5) {
            if (features[2] <= 0.5) {
                if (features[3] <= 7.0) {
                    classes[0] = 0;
                    classes[1] = 3;
                } else {
                    if (features[4] <= 4.5) {
                        if (features[0] <= 3.5) {
                            classes[0] = 1;
                            classes[1] = 0;
                        } else {
                            classes[0] = 0;
                            classes[1] = 2;
                        }
                    } else {
                        if (features[0] <= 3.0) {
                            classes[0] = 2;
                            classes[1] = 0;
                        } else {
                            classes[0] = 0;
                            classes[1] = 1;
                        }
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 9;
            }
        } else {
            if (features[3] <= 7.0) {
                if (features[0] <= 5.0) {
                    classes[0] = 0;
                    classes[1] = 3;
                } else {
                    if (features[2] <= 1.5) {
                        classes[0] = 0;
                        classes[1] = 3;
                    } else {
                        classes[0] = 2;
                        classes[1] = 0;
                    }
                }
            } else {
                if (features[3] <= 15.0) {
                    if (features[7] <= 0.5) {
                        classes[0] = 5;
                        classes[1] = 0;
                    } else {
                        if (features[4] <= 4.5) {
                            classes[0] = 1;
                            classes[1] = 0;
                        } else {
                            classes[0] = 0;
                            classes[1] = 1;
                        }
                    }
                } else {
                    if (features[4] <= 4.5) {
                        if (features[0] <= 6.5) {
                            classes[0] = 0;
                            classes[1] = 2;
                        } else {
                            classes[0] = 1;
                            classes[1] = 0;
                        }
                    } else {
                        if (features[2] <= 0.5) {
                            classes[0] = 1;
                            classes[1] = 0;
                        } else {
                            classes[0] = 0;
                            classes[1] = 3;
                        }
                    }
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

        if (features[5] <= 0.5) {
            if (features[0] <= 3.5) {
                if (features[4] <= 3.5) {
                    classes[0] = 0;
                    classes[1] = 3;
                } else {
                    if (features[7] <= 1.5) {
                        classes[0] = 3;
                        classes[1] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 3;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 5;
            }
        } else {
            if (features[2] <= 0.5) {
                if (features[4] <= 4.5) {
                    if (features[3] <= 7.0) {
                        classes[0] = 0;
                        classes[1] = 2;
                    } else {
                        classes[0] = 6;
                        classes[1] = 0;
                    }
                } else {
                    if (features[0] <= 0.5) {
                        classes[0] = 2;
                        classes[1] = 0;
                    } else {
                        if (features[7] <= 0.5) {
                            if (features[0] <= 5.5) {
                                if (features[3] <= 7.0) {
                                    classes[0] = 0;
                                    classes[1] = 1;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 0;
                                }
                            } else {
                                classes[0] = 1;
                                classes[1] = 0;
                            }
                        } else {
                            if (features[3] <= 7.0) {
                                classes[0] = 0;
                                classes[1] = 3;
                            } else {
                                if (features[0] <= 3.5) {
                                    classes[0] = 1;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 1;
                                }
                            }
                        }
                    }
                }
            } else {
                if (features[4] <= 4.5) {
                    classes[0] = 2;
                    classes[1] = 0;
                } else {
                    if (features[3] <= 7.0) {
                        classes[0] = 0;
                        classes[1] = 1;
                    } else {
                        classes[0] = 5;
                        classes[1] = 0;
                    }
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

    public static int predict_9(double[] features) {
        int[] classes = new int[2];

        if (features[5] <= 0.5) {
            if (features[0] <= 3.5) {
                if (features[0] <= 2.5) {
                    if (features[2] <= 0.5) {
                        classes[0] = 1;
                        classes[1] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 6;
                    }
                } else {
                    classes[0] = 2;
                    classes[1] = 0;
                }
            } else {
                classes[0] = 0;
                classes[1] = 9;
            }
        } else {
            if (features[4] <= 3.5) {
                classes[0] = 2;
                classes[1] = 0;
            } else {
                if (features[2] <= 1.5) {
                    if (features[3] <= 7.0) {
                        if (features[0] <= 0.5) {
                            classes[0] = 1;
                            classes[1] = 0;
                        } else {
                            classes[0] = 0;
                            classes[1] = 3;
                        }
                    } else {
                        if (features[4] <= 4.5) {
                            classes[0] = 2;
                            classes[1] = 0;
                        } else {
                            if (features[0] <= 5.5) {
                                if (features[7] <= 0.5) {
                                    classes[0] = 1;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 3;
                                }
                            } else {
                                if (features[3] <= 15.0) {
                                    classes[0] = 3;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 2;
                                }
                            }
                        }
                    }
                } else {
                    if (features[0] <= 6.5) {
                        classes[0] = 0;
                        classes[1] = 2;
                    } else {
                        classes[0] = 3;
                        classes[1] = 0;
                    }
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

    public static int predict(double[] features) {
        int n_classes = 2;
        int[] classes = new int[n_classes];
        classes[LivenessModeClassifier.predict_0(features)]++;
        classes[LivenessModeClassifier.predict_1(features)]++;
        classes[LivenessModeClassifier.predict_2(features)]++;
        classes[LivenessModeClassifier.predict_3(features)]++;
        classes[LivenessModeClassifier.predict_4(features)]++;
        classes[LivenessModeClassifier.predict_5(features)]++;
        classes[LivenessModeClassifier.predict_6(features)]++;
        classes[LivenessModeClassifier.predict_7(features)]++;
        classes[LivenessModeClassifier.predict_8(features)]++;
        classes[LivenessModeClassifier.predict_9(features)]++;

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
        if (args.length == 9) {

            // Features:
            double[] features = new double[args.length];
            for (int i = 0, l = args.length; i < l; i++) {
                features[i] = Double.parseDouble(args[i]);
            }

            // Prediction:
            int prediction = LivenessModeClassifier.predict(features);
            System.out.println(prediction);

        }
    }
}