while (<>) {
    print if /^(?! ).*(?<! )$/;
}